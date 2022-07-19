package com.zouzhao.question11;

import java.util.Scanner;

public class Console {
    Scanner scan=new Scanner(System.in);

    public int getNumber(){
        int num;
        while (true) {
            System.out.println("输入一个大于6的偶数");
            num = scan.nextInt();
            if ((num&1)==0 && num>6)break;
        }
        return num;
    }
}
