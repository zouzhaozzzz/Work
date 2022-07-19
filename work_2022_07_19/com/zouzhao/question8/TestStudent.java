package com.zouzhao.question8;

public class TestStudent {
    public static void main(String[] args) {
    Student stu1=new Student("tom",18);
        System.out.println(stu1+" "+100);
        System.out.println(100+" "+stu1);
        System.out.println(" "+100+stu1);
//        System.out.println(stu1+100+" ");
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return  name + " " +
               + age ;
    }
}