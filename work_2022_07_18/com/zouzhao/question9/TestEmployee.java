package com.zouzhao.question9;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees=new Employee[]{new SalariedEmployee(10,"zs1",1000),new HourlyEmployee(8,"zs2",20,240),
        new SalesEmployee(6,"zs3",10000,0.2),new BasePlusSalesEmployee(3,"zs4",10000,0.2,500)};
        int month=6;
        int count=0;
        for (Employee employee : employees) {
            System.out.println(employee.getSalary(month));
            count+=employee.overtimePay();
        }
        System.out.println("加班费"+count);

    }

}