package com.zouzhao;


import com.alibaba.excel.EasyExcel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RandomNum {
    public static void main(String[] args) {

        randomStudent(100000);



    }

    private static void randomStudent(int n) {
        //生成学生集合前时间
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);

        Student[] students = new Student[n];
        double sexMCount = 0;
        double sexFCount = 0;
        int length = students.length;
        double age1 = 0, age2 = 0, age3 = 0;

        for (int i = 0; i < length; i++) {
            students[i] = new Student();
            //设置名字
            students[i].setName(rdStr(10));

            //设置性别
            while (true) {
                String sex = rdSex();
                if (sex == "male" && sexMCount / length < 0.5) {
                    students[i].setSex(sex);
                    sexMCount++;
                    break;
                }
                if (sex == "female" && sexFCount / length < 0.5) {
                    students[i].setSex(sex);
                    sexFCount++;
                    break;
                }
            }

            //设置年龄
            while (true) {
                int age = rdNum();
                if (age >= 18 && age < 20 && age1 / length < 0.2) {
                    students[i].setAge(age);
                    age1++;
                    break;
                } else if (age2 / length < 0.5 && age >= 20 && age < 25) {
                    students[i].setAge(age);
                    age2++;
                    break;
                } else if (age3 / length < 0.3 && (age < 18 || age >= 25)) {
                    students[i].setAge(age);
                    age3++;
                    break;
                }

            }

        }//for

        //生成学生集合后时间
        Date date2 = new Date();
        String dateStr2 = simpleDateFormat.format(date2);

        //1、输出学员信息列表
        for (int i = 0; i < length; i++) {
            System.out.println(students[i]);
        }

        //2、输出实际生成的学生统计信息（男女比例，年龄比例）
        double countSex = 0;
        double countAge1 = 0, countAge2 = 0;
        for (int i = 0; i < length; i++) {
            if (students[i].sex == "male") countSex++;
            if (students[i].age >= 18 && students[i].age < 20) countAge1++;
            else if (students[i].age >= 20 && students[i].age < 25) countAge2++;
        }
        System.out.println("男女比例:" + countSex / length + "    年龄比例： [18,20):" + countAge1 / length + "  [20,25):" + countAge2 / length + "  其余:" + (1 - countAge1 / length - countAge2 / length));


        //导出学生集合后时间
        Date date3= new Date();
        String dateStr3 = simpleDateFormat.format(date3);

        //实现excel写的操作
        //1 设置写入文件夹地址和excel文件名称 没有的话会自动创建
        String filename = "D:\\java111\\123\\work\\student.xlsx";
        //2 调用easyexcel里面的方法实现写操作
        //write方法两个参数：第一个参数文件路径名称，第二个参数实体类class
        EasyExcel.write(filename, Student.class).sheet("学生列表").doWrite(getData(students));

        //导出学生集合后时间
        Date date4= new Date();
        String dateStr4 = simpleDateFormat.format(date4);

        System.out.println("生成学生集合前时间："+dateStr1);
        System.out.println("生成学生集合后时间："+dateStr2);
        System.out.println("导出学生集合后时间："+dateStr3);
        System.out.println("导出学生集合后时间："+dateStr4);
    }



    /**
     * 返回学生list集合
     * @param students
     * @return
     */
    private static List<Student> getData(Student[] students) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            Student student = new Student();
            student = students[i];
            list.add(student);
        }
        return list;
    }

    /**
     * 随机生成指定长度的字符串（字符串内容选择范围为[A-Za-z]）
     *
     * @param length
     * @return 指定长度的字符串（字符串内容选择范围为[A-Za-z]）
     */
    private static String rdStr(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            int c = (int) (Math.random() * 52);   //0-51
            //A-Z
            if (c <= 25) str += (char) (c + 65); //65-90
            //a-z
            if (c > 25) str += (char) (c + 71); //97-122
        }
        return str;
    }

    /**
     * 随机生成1-100之间的整数
     *
     * @return 1-100之间的整数
     */
    public static int rdNum() {
        return (int) (Math.random() * 100 + 1);  //1-100
    }

    /**
     * 随机生成性别字符串(male / female)
     *
     * @return 性别字符串(male / female)
     */
    public static String rdSex() {
        int i = (int) (Math.random() * 2);    //0,1
        if (i == 0) return "male";
        else return "female";
    }


}
