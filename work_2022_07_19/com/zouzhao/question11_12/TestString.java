package com.zouzhao.question11_12;

public class TestString {
    public static void main(String[] args) {
        String s="zhengcg@zparkhr.com";
        int i = s.indexOf('@');
        System.out.println(s.substring(0, i ));

        if(s.contains("@") && s.contains(".") && (s.lastIndexOf('.')>s.lastIndexOf('@')))
            System.out.println("合法");
        else System.out.println("不合法");
    }
}
