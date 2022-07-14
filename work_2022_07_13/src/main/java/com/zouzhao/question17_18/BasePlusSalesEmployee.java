package com.zouzhao.question17_18;

public class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    @Override
    public double getSalary(int month) {
        return baseSalary+super.getSalary(month);
    }

    public BasePlusSalesEmployee(int month, String name, double sales, double rate, double baseSalary) {
        super(month, name, sales, rate);
        this.baseSalary = baseSalary;
    }
}
