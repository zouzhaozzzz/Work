package com.zouzhao.question17_18;

public class SalesEmployee extends Employee{
    private double sales;
    private double rate;

    @Override
    public double getSalary(int month) {
        return sales*rate+super.getSalary(month);
    }

    public SalesEmployee(int month, String name, double sales, double rate) {
        super(month, name);
        this.sales = sales;
        this.rate = rate;
    }
}
