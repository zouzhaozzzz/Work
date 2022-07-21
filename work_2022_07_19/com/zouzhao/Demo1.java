package com.zouzhao;

public class Demo1 {
    public static void main(String[] args) {

        Integer i=new Integer(10);
        Integer i2=new Integer(10);
        //常量池
        Integer i3=10;
        Integer i4=10;
        System.out.println(i==i2);
        System.out.println(i.equals(i2));

        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));
    }
}
