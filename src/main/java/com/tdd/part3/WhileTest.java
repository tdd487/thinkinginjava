package com.tdd.part3;

/**
 * Created by TDD on 2017/3/10.
 * while(布尔表达式)
 * 语句
 * 在循环刚开始时，会计算一个“布尔表达式”的值。而对于后来每一次额外的循环，们都会在开始前重新计算一次。
 */
public class WhileTest {
    public static void main(String args[]){
        double r = 0;
        int i = 0;
        while (r<.099d){
            System.out.println(i++);
            r = Math.random();
            System.out.println(r);
        }
    }
}
