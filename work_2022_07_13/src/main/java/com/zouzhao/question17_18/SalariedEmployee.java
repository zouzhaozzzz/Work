package com.zouzhao.question17_18;

public class SalariedEmployee extends Employee{
    private double salary;

    public double getSalary(int month) {
        return salary+super.getSalary(month);
    }

    public SalariedEmployee(int month, String name, double salary) {
        super(month, name);
        this.salary = salary;
    }
}
