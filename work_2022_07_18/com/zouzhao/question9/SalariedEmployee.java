package com.zouzhao.question9;

public class SalariedEmployee extends Employee {
    private double salary;

    public double getSalary(int month) {
        return salary+super.getSalary(month)+overtimePay();
    }

   public double overtimePay() {
        return 2000;
    }

    public SalariedEmployee(int month, String name, double salary) {
        super(month, name);
        this.salary = salary;
    }
}
