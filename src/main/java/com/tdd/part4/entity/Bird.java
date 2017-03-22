package com.tdd.part4.entity;

/**
 * Created by TDD on 2017/3/11.
 * 默认构建器是没有自变量的。它的作用是创建一个“空对象”。若创建一个没有构建器的类，则编译程序会帮我们自动创建一个默认
 * 构建器。如果已经定了一个构建器，编译程序都不会帮我们自动合成一个。
 */
public class Bird {
    int i;
    Bird(int i){
        System.out.println("print"+i);
    };
    Bird(double d){};
    public static void main(String args[]){
        int i = 0;
        new Bird(i);
    }
}
