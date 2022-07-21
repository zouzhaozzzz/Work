package com.zouzhao;

import org.openjdk.jol.vm.VM;

import java.util.*;

public class Worker extends Person{
    private String name;
    private int age;
    private double salary;

    public static void main(String[] args) {
//        //第一问
//        List<Worker> list=new ArrayList<>();
//        Worker w1 = new Worker("zhang3", 18, 3000);
//        Worker w2 = new Worker("li4", 25, 3500);
//        Worker w3 = new Worker("wang5", 22, 3200);
//        list.add(w1);
//        list.add(w2);
//        list.add(w3);
//        //第二问
//        list.add(1,new Worker("zhao6",24,3300));
//        //第三问
//        list.remove(w3);
//        //第四问
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).name+" "+list.get(i).age+" "+list.get(i).salary);
//        }
//        //第五问
//        for (Worker worker : list) {
//            worker.work();
//        }

        //第8题
        Set<Worker> set=new HashSet<>();
        Worker z1 = new Worker("zhao6", 24, 3300);
        Worker z2 = new Worker("zhao7", 24, 3300);
        Worker z3 = new Worker("zhao6", 24, 3300);
        Worker z4= new Worker("zhao8", 24, 3300);
        HashMap map=new HashMap();
        map.values();
        System.out.println(z1.hashCode());
        System.out.println(z3.hashCode());
        System.out.println(z1.equals(z3));
        System.out.println(z1);
        System.out.println(VM.current().addressOf(z1));
        System.out.println(z3);
        System.out.println(VM.current().addressOf(z3));
        System.out.println(z1==z3);
//        String n="helllo";
//        System.out.println(n.replaceAll("(.)\\1+", "$1$1").replaceAll("(.)\\1(.)\\2", "$1$1$2"));

//        set.add(z1);
//        set.add(z2);
//        set.add(z3);
//        set.add(z4);
//        for (Worker worker : set) {
//            System.out.println(worker);
//        }
//
//        Person p=new Worker("zhao6", 24, 3300);
//        Worker w=new Worker("zhao6", 24, 3300);
//
//        System.out.println(w.equals(p));

    }
    //第六问
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Double.compare(worker.salary, salary) == 0 && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }


//    public String toString() {
//        return "Worker{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }

    public void work(){
        System.out.println(name+"work");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Worker() {
    }
}
class Person{

}