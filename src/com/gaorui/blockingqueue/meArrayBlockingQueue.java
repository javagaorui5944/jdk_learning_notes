package com.gaorui.blockingqueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by gaorui on 16/7/1.
 */
/**
 *
 * @author JavaGR_ais
 * @describe  用PriorityQueue优先队列,对象的wait,notify方法来实现一个生产者,消费者的阻塞队列非常赞一个东西
 * synchronized (Object)  ,这里的object是监视器要监视的对象.当一个对象被监视器监视的时候,同一时刻只能有一个线程访问它,
 */
public class meArrayBlockingQueue<E> implements BlockingQueue<E> {

    Object[] items;

    private int city = 0;

    private final int capacity;//定义队列阻塞最大长度

    public meArrayBlockingQueue(int capacity){

        this.capacity = capacity;
        items = new Object[capacity+1];
    }

    @Override
    public void put(E e) throws InterruptedException {
        synchronized (items){
            while(city==this.capacity){

                System.out.println("队列元素已满,生产者不能再生产了");
                items.wait();

            }

            //items.offer(1);
            items[city] = e;
            city++;
            items.notify();
            System.out.print("队列+1,生产者刚生产了==");
            System.out.println("items.length"+(city));

        }
    }

    @Override
    public E take() throws InterruptedException {

        E e = null;
        synchronized (items) {
            while (city == 0) {

                System.out.println("数组为空,消费者被阻塞");
                items.wait();
            }
            //queue.poll();
            e = (E) items[city-1];
            items[city] = null;
            city--;

            items.notify();
            System.out.print("对列-1,消费者刚消费了==");
            System.out.println("items.length"+(city));

        }
        return e;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }


    @Override
    public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }


    @Override
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return null;
    }

    @Override
    public int remainingCapacity() {
        return 0;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return city;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public int drainTo(Collection<? super E> c) {
        return 0;
    }

    @Override
    public int drainTo(Collection<? super E> c, int maxElements) {
        return 0;
    }
}
