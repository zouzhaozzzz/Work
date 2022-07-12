package com.zouzhao.Service;

import com.zouzhao.pojo.Student;

public class StudentService {
    Student[] students = new Student[100];

    /**
     * 增加学生
     * @param student 增加的学生信息
     */
    public void add(Student student) {
        int i = 0;
        //students[i] = new Student();
        while (students[i] != null) {
            i++;
            if (i == students.length) {
                System.out.println("学生插入已满，无法录入学生");
                return;
            }
        }
        students[i] = new Student(student);
        System.out.println("插入成功");
    }

    /**
     * 删除学生
     * @param id 删除的学生的id
     */
    public void del(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                students[i] = null;
                System.out.println("删除成功");
                return;
            }
        }
    }

    //显示所有学生信息
    public void show() {
        boolean flag = true;
        for (Student student : students) {
            if (student != null) {
                System.out.println("姓名：" + student.getName() + "  学号:" + student.getId() + "  年龄" + student.getAge());
                flag = false;
            } else break;
        }
        if (flag) System.out.println("学生列表为空!");
    }

    /**
     * 根据学号查找学生
     * @param id 查找学生的学号
     */
    public void findById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                System.out.println("id:" + students[i].getId() + " name:" + students[i].getName() + " age:" + students[i].getAge());
                return;
            }
        }
    }

    /**
     * 修改学生信息
     * @param id 修改学生信息id
     * @param name 修改学生信息name
     * @param age 修改学生信息age
     */
    public void updateById(int id, String name, int age) {

        for (Student student : students) {
            if (student != null && student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                System.out.println("修改成功");
                return;
            }
        }
    }

    /**
     * 判断该学号的学生是否存在
     * @param id 学生学号
     * @return 是否存在
     */
    public boolean judgeExistId(int id) {
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                return true;
            }
        }
        System.out.println("该学号的学生不存在");
        return false;
    }

    /**
     * 判断插入是否id重复
     * @param id 插入的id
     * @return 是否重复
     */
    public boolean judgeRepeatId(int id) {
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                System.out.println("id已存在");
                return false;
            }
        }
        return true;
    }


}
