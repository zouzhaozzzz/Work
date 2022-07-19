package com.zouzhao.question11;

import java.util.ArrayList;

public class SplitNumberImpl implements SplitNumber{
    @Override
    public ArrayList<int[]> spilt(int number) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 3; i < number/2; i++) {
            int[] ints = new int[]{i,(number-i)};
            list.add(ints);
        }
        return list;
    }
}
