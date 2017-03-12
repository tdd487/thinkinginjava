package com.tdd.part4;

/**
 * Created by TDD on 2017/3/12.
 * Garbage:垃圾
 */
public class Garbage {
    public static void main(String args[]){
        /*if(args.length == 0){
            System.out.println("Usage: \n"+"java Garbage before \n or :\n"+"java Garbage after");
            return;
        }*/
        while (!Chair.f){
            new Chair();
            new String("To take up space");
        }
        System.out.println("After all Chairs have been created:\n"+"total created = "+Chair.created+",total" +
                " finalized = "+ Chair.finalized);
        if(args[0].equals("beforce")){
            System.out.println("gc():");
            System.gc();
            System.out.println("runFinalization():");
            System.runFinalization();
        }
        System.out.println("bye");
        if(args[0].equals("after")){
           System.runFinalizersOnExit(true);
        }
    }
}
