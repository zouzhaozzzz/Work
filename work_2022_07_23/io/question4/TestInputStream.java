package io.question4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        String path="hello.txt";
        FileInputStream in = new FileInputStream(path);

    }
}
