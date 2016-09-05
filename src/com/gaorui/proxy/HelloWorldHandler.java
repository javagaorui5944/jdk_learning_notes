package com.gaorui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by gaorui on 16/9/4.
 */
public class HelloWorldHandler implements InvocationHandler {
       private Object obj;

    public HelloWorldHandler(Object obj) {
                 //super();
                 this.obj = obj;
             }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
                //调用之前
                  doBefore();
                 //调用原始对象的方法
                 result=method.invoke(obj, args);
                 //调用之后
                 doAfter();
                 return result;
    }

    private void doBefore(){
        System.out.println("before method invoke");

    }
    private void doAfter(){

                 System.out.println("after method invoke");
    }

}
