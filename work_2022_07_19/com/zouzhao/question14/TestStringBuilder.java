package com.zouzhao.question14;

import java.util.Random;

public class TestStringBuilder {
    public static void main(String[] args) {
        Random random = new Random();
        String s="ABCDEFGhijklmn1234567";
        String[] str = s.split("");
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            b.append(str[random.nextInt(str.length)]);
        }
        System.out.println(b);
    }
}
