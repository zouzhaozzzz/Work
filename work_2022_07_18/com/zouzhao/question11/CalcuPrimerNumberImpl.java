package com.zouzhao.question11;

import java.util.ArrayList;
import java.util.List;

public class CalcuPrimerNumberImpl implements CalcuPrimeNumber {

    @Override
    public List<int[]> judgePrime(List<int[]> list) {
        ArrayList<int[]> res = new ArrayList<>();
        for (int[] ints : list) {
            if (judge(ints[0]) && judge(ints[1])){
            res.add(new int[]{ints[0],ints[1]});
            }

        }

        return res;
    }

    private boolean judge(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0)return false;
        }
        return true;
    }


}
