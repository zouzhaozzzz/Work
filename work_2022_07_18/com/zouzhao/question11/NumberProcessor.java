package com.zouzhao.question11;

import java.util.Arrays;
import java.util.List;

public class NumberProcessor
{
    private final  Console console=new Console();
    private final  SplitNumber splitNumber=new SplitNumberImpl();
    private final  CalcuPrimeNumber calcuPrimeNumber=new CalcuPrimerNumberImpl();


    public void run() {
        int number = console.getNumber();
        List<int[]> spilt = splitNumber.spilt(number);
        List<int[]> result = calcuPrimeNumber.judgePrime(spilt);
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
