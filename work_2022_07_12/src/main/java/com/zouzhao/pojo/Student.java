package com.zouzhao.pojo;

public class Student {
    private String name;
    private int id;
    private int age;

    public Student() {
    }

    public Student(String name, int id, int classes, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public Student(Student student) {
        this.name = student.name;
        this.id = student.id;
        this.age = student.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }



    public int getAge() {
        return age;
    }
}
