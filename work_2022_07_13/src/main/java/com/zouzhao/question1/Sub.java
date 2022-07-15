package com.zouzhao.question1;

public class Sub extends Super {

    public Sub() {
        System.out.println("Sub()");
    }

    public Sub(int i) {
//       this();
//        super(i);
        super(i);
        System.out.println("Sub(int)");
    }

    public void method(){
        System.out.println("methodSub");
    }

//    public Sub(String str) {
//        System.out.println("Sub(String)");
//    }
}

