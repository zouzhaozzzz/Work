package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Teacher implements Comparable<Teacher>{
    String name;
    int age;
    double salary;

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

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Teacher o) {
        if (getAge()!=o.getAge()){
            return Integer.compare(getAge(),o.getAge());
        }
        else if (getAge()==o.getAge()){
            return compare(o);
        }
        return 0;
    }
    public int compare(Teacher o){
        if (o.getSalary()-getSalary()>0){
            return 1;
        }else
            return -1;
    }

    public static void main(String[] args) {
        List<Teacher> list = new ArrayList();
        list.add(new Teacher("zhangui", 32, 4000));
        list.add(new Teacher("xhuiw", 24, 2937));
        list.add(new Teacher("niuw", 24, 5237));
        list.add(new Teacher("niuw", 24, 5238));
        list.add(new Teacher("xbwui", 21, 5722));
        Collections.sort(list);
        for (Teacher t:list) {
            System.out.print(t.getName()+" "+t.getAge()+" "+t.getSalary());
            System.out.println();
        }
    }
}
