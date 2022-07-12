package com.zouzhao;

import com.zouzhao.Service.StudentService;
import com.zouzhao.pojo.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentService service = new StudentService();
        boolean flag=true;
        while (flag) {
            System.out.println("=============");
            System.out.println("1显示学员列表信息\n2录入学员信息\n"+
                    "3修改学员信息\n4删除学员信息\n5根据id查找学生\n0退出系统");
            System.out.println("输入选择：");
            int c = scan.nextInt();
            switch (c){
                case 1:
                    service.show();break;
                case 2:
                    Student stu = new Student();
                    System.out.println("输入学生的学号：");
                    stu.setId(scan.nextInt());
                    if (service.judgeRepeatId(stu.getId())) {
                        System.out.println("输入学生的姓名：");
                        stu.setName(scan.next());
                        System.out.println("输入学生的年龄：");
                        stu.setAge(scan.nextInt());
                        service.add(stu);
                    }
                    break;
                case 3:
                    service.show();
                    System.out.println("输入要修改学生的id");
                    int id= scan.nextInt();
                    if(service.judgeExistId(id)) {
                        System.out.println("输入要修改的name、age");
                        String name = scan.next();
                        int age = scan.nextInt();
                        service.updateById(id, name, age);
                    }
                   break;
                case 4:
                    service.show();
                    System.out.println("输入要删除学生的id");
                    int id2= scan.nextInt();
                    if (service.judgeExistId(id2)) {
                        service.del(id2);
                    }
                    break;
                case 5:
                    System.out.println("输入要查找删除学生的id");
                    int id3= scan.nextInt();
                    if (service.judgeExistId(id3)) {
                        service.findById(id3);
                    }
                    break;
                case 0:
                    flag=false;break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }//switch

        }
        
    }
}
