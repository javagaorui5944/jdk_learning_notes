###校招提前批面经

* 微店简历面(面试官前辈人很好,后面还帮我问了我的面试进度)
 * classloader机制,tomcat的类加载机制
 * jvm gc,对象得不到内存分配怎么排查
 * 多线程线程通信问题
 * redis memcached 区别
 * nginx的使用
 * 项目闲聊
 * 发展,平时看哪些书
 

* 微店二面(面试官前辈人很和蔼,给了很多鼓励,希望能有hr面吧)
 * Java锁知道哪些(synchronized reentrantlock.说了下两者的区别,reentrantlock在arrayblockingqueue源码中看到过)
 * 队列,堆(大小根堆,删除和添加后的初始化堆)
 * 思维题:实现一个数据结构,实现添加和删除,并且查找中间值时间复杂度为o(1)(面试官前辈提示了用两个堆但是还是没想出来,惭愧,得多多锻炼了)
 * 思维题:给一个数组,去掉部分数,保证a>b<c>d< 或者 a<b>c<d> (题有点忘记了,规律也没找出来,惭愧,得多多锻炼了)
 * 算法题:从字符串中返回每个单词和出现的次数(用了一种比较巧妙的方法, 用hashmap来当做存储对象,map.get(key)首先判断是否为null,为null则 则把map value置为1, 不为null则 用map.put(key,map.get(key)+1),我也向面试官前辈说明了还有一种方法,可以用map.containskey来做,不过第一种方法更简便,巧妙)

 

* 搜狐畅游一面(一次平等的交流,面试官前辈人很好)
 * 自我介绍,规划(拿到一个不错的offer,完成好公司的项目后希望自己能进入到开源的大军中)
 * 从规划开源中问了下我对哪个开源项目比较了解,我就说了SpringMVC了解一点,然后介绍了下自己的AisMVC框架,也解释了自己对springmvc源码并没吃透,面试官前辈也知道了我只模仿了SpringMVC的轮子形状。
 * 聊了下websoket,基本中间的都是开放性技术问题,让自己自由的说。

 

* 美图秀秀(一次平等的交流,面试官前辈人很好)
 * 介绍项目,项目问题扩展(我思维比较敏捷,但是严谨性和逻辑性太差,聊了20分钟,面试官前辈选择下一个问题)
 * 对java哪些容器比较了解,arraylist具体实现,扩容需要自己手动去实现么,扩容为原来的几倍(底层数组,不用因为底层封装好了,Arrays.copyOf() 返回新的size数组)

 
* 阿里一面(一次平等的交流,面试官前辈人很好)
 * 定时器原理，自己设计一个定时器
 * 快排，快排优化
 * hashmap，concurenthahsmap
 * spring 启动过程，mabatis 二级缓存
 * classloader，jmm（volatile原理）
 * jvm（cms收集算法）
 
* dhy 阿里一面
 * spring（IOC、AOP）
 * Object的方法 
 * 验证码原理 
 * session和cookie
 * 栈内存何时创建和回收
 * 怎么判断对象是否死亡
 * 很多页面都需要登录如何那验证逻辑简单化（拦截器和过滤器）
 * springmvc拦截器使用方法
 * 一篇文章找出重复次数最多的单词
 * 建立一个HTTP请求需要传递几个报文
 * linux第一些命令
 
* 携程电话一面
 * 简单聊了下做过的项目10分钟左右,有没有遇到过什么深刻的项目问题
 * 有哪几种序列化方式,如果有海量数据需要序列化选择哪种好
 * hash表原理,hashmap,concurrenthashmap
 * 一致性hash算法
 * 问我考研不后面,为啥想来携程,面试官前辈偷偷笑了下。。。

* 携程视频二面(手写代码,感觉很差)
 * 从1-32随机选取生成不重复的5个随机数
 * 从字符串中找每个单词的重复次数,每个单词的分隔符可以是逗号,空格,句号
 
 

 
###jdk源码探究,在准备面试期间也会每天进行更新,对目前学习的总结以及督促自己
* BlockingQueue
 * [手动实现了一个阻塞队列,模仿了ArrayBlockingQueue,但用了object对象的notify和wait方法作为线程通信](https://github.com/javagaorui5944/jdk_learning_notes/blob/master/src/com/gaorui/blockingqueue/meArrayBlockingQueue.java)
* Map
 * [分析hash map源码,通过hashmap的put方法入口 分析hash方法,indexfor方法巧妙的运用hash算法和&运算拿到槽点，然后如何利用链表解决hash冲突。](https://github.com/javagaorui5944/jdk_learning_notes/blob/master/src/com/gaorui/map/Hashmap.md)
