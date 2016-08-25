###面经
* 阿里一面(一次平等的交流,面试官前辈人很好)
 * 定时器原理，自己设计一个定时器
 * 快排，快排优化
 * hashmap，concurenthahsmap
 * spring 启动过程，mabatis 二级缓存
 * classloader，jmm（valatile原理）
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
 
 
* 微店简历面
 * classloader机制,tomcat的类加载机制
 * jvm gc,对象得不到内存分配怎么排查
 * 多线程线程通信问题
 * redis memcached 区别
 * nginx的使用
 * 项目闲聊
 * 发展,平时看哪些书
 
###jdk源码探究,在准备面试期间也会每天进行更新,对目前学习的总结以及督促自己
* BlockingQueue
 * [手动实现了一个阻塞队列,模仿了ArrayBlockingQueue,但用了object对象的notify和wait方法作为线程通信](https://github.com/javagaorui5944/jdk_learning_notes/blob/master/src/com/gaorui/blockingqueue/meArrayBlockingQueue.java)
* Map
 * [分析hash map源码,通过hashmap的put方法入口 分析hash方法,indexfor方法巧妙的运用hash算法和&运算拿到槽点，然后如何利用链表解决hash冲突。](https://github.com/javagaorui5944/jdk_learning_notes/blob/master/src/com/gaorui/map/Hashmap.md)
