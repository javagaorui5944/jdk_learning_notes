###jdk源码探究,在准备面试期间也会每天进行更新,对目前学习的总结以及督促自己。后面想研究下java字节码技术。。。。
* BlockingQueue
 * [手动实现了一个阻塞队列,模仿了ArrayBlockingQueue,但用了object对象的notify和wait方法作为线程通信](https://github.com/javagaorui5944/jdk_learning_notes/blob/master/src/com/gaorui/blockingqueue/meArrayBlockingQueue.java)
* Map
 * [分析hash map源码,通过hashmap的put方法入口 分析hash方法,indexfor方法巧妙的运用hash算法和&运算拿到槽点，然后如何利用链表解决hash冲突。](https://github.com/javagaorui5944/jdk_learning_notes/blob/master/src/com/gaorui/map/Hashmap.md)
