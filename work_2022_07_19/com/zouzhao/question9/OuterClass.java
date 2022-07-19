package com.zouzhao.question9;

public class OuterClass {
    private int v1=100;
    private static int v2=100;
    public void method(int v3){
        final int v4=100;
        class InnerClass{
            public void print(){
                System.out.println(v1);
            }
        }
    }
}
