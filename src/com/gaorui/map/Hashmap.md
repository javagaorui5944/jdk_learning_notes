


###Hashmap 源码分析
* put（）null的处理,重复key的处理，hash冲突的链表处理
* indexfor（） hash算法从而获得槽点的巧妙用处

```Java


 public V put(K key, V value) {
 
     //空表处理
        if (table == EMPTY_TABLE) {
            inflateTable(threshold);
        }
        //null处理，因为hanshmap允许传入null
        if (key == null)
            return putForNullKey(value); 
    ------int hash = hash(key);//参数key 进行hash，返回 hash值
    | ----- int i = indexFor(hash, table.length);//得到bucket的槽点
    |   
        /**
        循环遍历，找到合适位置插入,可以看到e ＝＝null 跳出循环,存储Entry<key,value>对象
           e！＝null  hash冲突， e = e.next 这里是解决hash冲突的关键，我们叫做拉链法，增加了一个表存储Entry<key,value>对象
        举个例子大家就懂了：
        第一个键值对A进来，通过计算其key的hash得到的index=0，记做:Entry[0] = A。
        一会后又进来一个键值对B，通过计算其index也等于0，现在怎么办？
             HashMap会这样做:B.next = A,Entry[0] = B,如果又进来C,index也等于0,
        那么C.next = B,Entry[0] = C；这样我们发现index=0的地方其实存取了A,B,C三个键值对,
       他们通过next这个属性链接在一起
        */
    |   for (Entry<K,V> e = table[i]; e != null; e = e.next) {
    |      Object k;
    |        //重复key,覆盖原key的value
    |       if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
    |      
    |            V oldValue = e.value;
    |            e.value = value;
    |            e.recordAccess(this);
    |           return oldValue;
    |      }
    |    }
    |
    |   modCount++;
    |  addEntry(hash, key, value, i);//合适位置插入了Entry<key,value>对象
    |    return null;
    |  }
    |
    |
     //hashmap的hash方法，可以看到调用了 native hashcode方法，中间算法太过复杂，不作深入研究
    |
    |－－➡️ final int hash(Object k) {
    |    int h = hashSeed;
    |    if (0 != h && k instanceof String) {
    |        return sun.misc.Hashing.stringHash32((String) k);
    |    }
    |
    |    h ^= k.hashCode();
    |
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
       h ^= (h >>> 20) ^ (h >>> 12);
    |    return h ^ (h >>> 7) ^ (h >>> 4);
    |   }
    |
    |  //一个静态方法，得到槽点
    |---➡️   static int indexFor(int h, int length) {
        //这里源码的注释是传入的length必须为 非零2的幂，为什么要这么规定呢？看下面
        // assert Integer.bitCount(length) == 1 : "length must be a non-zero power of 2";
        
        /**
        & 与运算符(0 0 为0 ，1 0 为 0，1 1 为1)，
        2的幂的二进制有基础的同学可以发现它的二进制前几位都是0，
        这么做的后果是hash值 h 与length进行 &运算始终是<= length-1 的，
        最后返回key的槽点值

        */
        return h & (length-1);
    }
    
```