package com.zouzhao.question17_18;

public class Employee {
    private String name;
    private int month;

    public double getSalary(int month){
        if (month==this.month)return 100;
        return 0;
    }
    public Employee(int month,String name){
        this.month=month;
        this.name=name;
    }
}
