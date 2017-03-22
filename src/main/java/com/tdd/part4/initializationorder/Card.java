package com.tdd.part4.initializationorder;

/**
 * Created by TDD on 2017/3/12.
 */
public class Card {
    Tag t1 = new Tag(1);
    Card(){
        System.out.println("Card()");
        t3 = new Tag(33);
    }
    Tag t2 = new Tag(2);

    void f(){
        System.out.println("f()");
    }
    Tag t3 = new Tag(3);
}

