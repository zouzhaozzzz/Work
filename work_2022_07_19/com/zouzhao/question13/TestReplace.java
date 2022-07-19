package com.zouzhao.question13;

import java.util.UUID;

public class TestReplace {
    public static void main(String[] args) {
        String ss = UUID.randomUUID().toString().replace("-","");
        System.out.println(ss);
    }
}
