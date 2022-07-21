package question12;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null  )return false;
        if (o==this) return true;
        if (getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }

    public static void main(String[] args) {
        Set set=new HashSet();
        Student stu1=new Student();
        Student stu2=new Student("Tom",18);
        Student stu3=new Student("Tom",18);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        System.out.println(set.size());
    }
}
