package com.zouzhao.question1;

public class Sub extends Super {

    public Sub() {
        System.out.println("Sub()");
    }

    public Sub(int i) {
       this();
        System.out.println("Sub(int)");
    }

    public Sub(String str) {
        System.out.println("Sub(String)");
    }
}

