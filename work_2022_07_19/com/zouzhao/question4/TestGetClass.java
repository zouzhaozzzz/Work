package com.zouzhao.question4;

public class TestGetClass {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2=new Dog();
        System.out.println(a2 instanceof Animal);
        System.out.println(a1.getClass());
        System.out.println(a2.getClass());
        System.out.println(a1.getClass()==a2.getClass());
    }

}
class Animal{}
class   Dog extends Animal {}