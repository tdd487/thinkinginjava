package com.tdd.part3;

/**
 * Created by TDD on 2017/3/10.
 * 在任何循环语句的主题不分，也可以用break和continue控制循环的流程。
 * 其中，break用于强行退出循环，不执行循环中剩余的语句。而continue则停止执行当前的反复，然后退回循环起始和，开始新的反复。
 */
public class BreakAndContinue {
    public static void main(String args[]){
        for(int i= 0;i<100;i++){
            if(i==74)break;
            if(i%9!=0) continue;
            System.out.println(i);
        }
    }
}
