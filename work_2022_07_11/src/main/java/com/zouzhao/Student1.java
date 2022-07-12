package com.zouzhao;

public class Student1 {
    int age;
    String name;
    public Student1() {
    }
    void init(){
        name="limy";
        age=10;
    }

    public Student1(String name) {
        this.init();
        this.name = name;
    }

    public Student1(int age, String name) {
        this(name);
        this.init();
        this.age = age;
    }
}
