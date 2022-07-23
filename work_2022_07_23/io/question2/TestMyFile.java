package io.question2;

import java.io.File;

public class TestMyFile {

    public static void main(String[] args) {
        File file;
        file=new File("hello.txt");

        System.out.println(file.exists());
        if (file.exists()) System.out.println(file.getAbsolutePath());
    }
}
