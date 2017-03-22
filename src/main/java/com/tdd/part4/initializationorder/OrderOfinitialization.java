package com.tdd.part4.initializationorder;

/**
 * Created by TDD on 2017/3/12.
 * 在一个类中，初始化的顺序是由变量在类内定义的顺序决定的。即使变量定义大量遍布与方法定义的中间，那些变量仍会在调用任何方法之前得到初始化，甚至在构建器调用之前
 */
public class OrderOfinitialization {
    public static void main(String args[]){
        Card t = new Card();
        t.f();
    }
}
