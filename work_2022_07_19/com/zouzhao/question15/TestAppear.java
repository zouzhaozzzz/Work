package com.zouzhao.question15;

import java.util.Arrays;

public class TestAppear {
    public static void main(String[] args) {
        String s="123956838923173478943890234092";
        int[] count=new int[10];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'0']++;
        }
        System.out.println(Arrays.toString(count));
    }
}
