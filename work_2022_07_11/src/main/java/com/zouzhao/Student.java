package com.zouzhao;

import com.alibaba.excel.annotation.ExcelProperty;

public class Student {
    @ExcelProperty(value = "姓名",index = 0)
    String name;
    @ExcelProperty(value = "性别",index = 1)
    String sex;
    @ExcelProperty(value = "年龄",index = 2)
    int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }



    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
