package com.zouzhao.question2;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("23", 123);
        System.out.println(student);
        System.out.println(student1);
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+ age;
    }
}