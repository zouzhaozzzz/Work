package com.zouzhao;

public class Worker {
    String name;
    int age;
    double salary;
    Address addr;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work(){
    }

    public void setAddr(String address,String zipCode) {
       addr=new Address(address,zipCode);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address=" + addr.address + ", zipCode=" + addr.zipCode +
                '}';
    }


    public static void main(String[] args) {
        Worker zs = new Worker("zhangsan", 25, 2500);
        zs.setAddr("北京市海淀区清华园1号","100084");
        System.out.println(zs);
    }
}
