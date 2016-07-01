###jdk源码探究,在准备面试期间也会每天进行更新,对目前学习的总结以及督促自己
* BlockingQueue
 * 手动实现了一个阻塞队列,模仿了ArrayBlockingQueue,但用了object对象的notify和wait方法作为线程通信