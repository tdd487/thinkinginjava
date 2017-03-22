package com.tdd.part4.entity;

/**
 * Created by TDD on 2017/3/11.
 * 在构建器里调用构建器
 */
public class Flower {
    private int petalCount = 0;
    private String s = new String("null");
    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/  int arg  only, petalCount  = "+petalCount);
    }
    Flower(String ss){
        System.out.println("Constructor w/ String arg only, s ="+ss);
        s = ss;
    }
    Flower(String s,int petals){
        this(s);
        //this(petals); //Can't call two
        this.s = s;
        System.out.println("String & int args");
    }
    Flower(){
        this("hi",47);
        System.out.println("default constructor(no args)");
    }
    void print(){
        //this(11);//必须在构造函数体的第一条语句
        System.out.println("petalCount = "+petalCount + "s = "+s);
    }
    public static void main(String args[]){
        Flower flower = new Flower();
        flower.print();
    }
}
