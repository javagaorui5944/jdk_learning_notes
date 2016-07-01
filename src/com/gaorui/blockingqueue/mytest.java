package com.gaorui.blockingqueue;

/**
 * Created by gaorui on 16/7/1.  测试类
 */
public class mytest {
    meArrayBlockingQueue meArrayBlockingQueue = new meArrayBlockingQueue(3);
    public static void main(String[] args) {
        mytest mbq = new mytest();
        Consumer cs = mbq.new Consumer();
        Producer pd = mbq.new Producer();
        Thread t1 = new Thread(cs);
        Thread t2 = new Thread(pd);
        t2.start();
        try {
            Thread.sleep(2000);//保证生产者提前生产足够的资源
        } catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        t1.start();



    }

    //消费者内部类
    class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {

                try {
                    meArrayBlockingQueue.put(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }


        }
    }

    //生产者类
    class Producer  implements Runnable {

        @Override
        public void run() {
            while (true) {

                try {
                    meArrayBlockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // queue.notify();

            }
        }
    }
}
