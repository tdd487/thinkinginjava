package com.tdd.part4.overloading;

/**
 * Created by TDD on 2017/3/23.
 * 方法过载就是overloading
 * 指的是方法名一样，但是参数不一样，同样分别有两个同类型参数的方法，如果参数的顺序不一样，也是两个不同的方法，同样
 * 也是方法过载
 * 另外，static方法不能调用非static方法
 */
public class Overloading {
    public static void main(String args[]){
        /*for(int i = 0;i<5;i++){
            Tree t = new Tree();
            t.info();
            t.info("over loaded method");
        }
        new Tree();*/
        print(99,"我有99块钱");
        print("我好穷",0);
    }

    static void print(int i,String str){
        System.out.println("int :"+i+", String :"+str);
    }

    static void print(String str,int i){
        System.out.println("String :"+str+", int :"+i);
    }
}
