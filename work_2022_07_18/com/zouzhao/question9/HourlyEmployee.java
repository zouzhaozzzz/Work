package com.zouzhao.question9;

public class HourlyEmployee extends Employee{
    private double hourlySalary;
    private int hours;
    public double getSalary(int month){
        if (hours>160)return (hourlySalary*160+hourlySalary*1.5*(hours-160)+super.getSalary(month));
        return  hourlySalary*hours+super.getSalary(month);
    }

    public HourlyEmployee(int month, String name, double hourlySalary, int hours) {
        super(month, name);
        this.hourlySalary = hourlySalary;
        this.hours = hours;
    }
}
