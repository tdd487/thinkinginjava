package com.tdd.part4.entity;

/**
 * Created by TDD on 2017/3/23.
 * Tree类
 * 有一个height 属性变量，一个无参的构造函数 和有一个带一个参数的构造函数，一个不带参数的info方法和一个带了一个参数的
 * info方法，最后还有一个静态方法prt
 */
public class Tree {
    int height;
    Tree(){
        prt("Planting a seedling");
        height = 0;
    }
    Tree(int i){
        prt("Creating new Tree that is"+i+"feet tall");
    }
    void info(){
        prt("Tree is "+ height+"feet tall");
    }
    void info(String s){
        prt(s+":Tree is "+height+"feet tall");
    }
    static void prt(String s){
        System.out.println(s);
    }
}
