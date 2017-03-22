package com.tdd.part4.entity;

/**
 * Created by TDD on 2017/3/11.
 */
public class Leaf {
    private int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = "+i);
    }
    public static void main(String args[]){
        Leaf leaf = new Leaf();
        Leaf leaf1 = new Leaf();
        System.out.println(leaf.increment());
        System.out.println(leaf1.increment()==leaf.increment());
    }
}
