package io.question7;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) throws IOException {


        FileInputStream in = new FileInputStream("hello.txt");
        try {
            in.read();
            in.close();
        }catch (Exception e){

        }

    }
}
