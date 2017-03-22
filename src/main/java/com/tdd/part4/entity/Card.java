package com.tdd.part4.entity;

import com.tdd.part4.entity.Tag;

/**
 * Created by TDD on 2017/3/12.
 */
public class Card {
    Tag t1 = new Tag(1);
    public Card(){
        System.out.println("Card()");
        t3 = new Tag(33);
    }
    Tag t2 = new Tag(2);

    public void f(){
        System.out.println("f()");
    }
    Tag t3 = new Tag(3);
}

