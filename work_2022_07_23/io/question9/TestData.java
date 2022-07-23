package io.question9;

import java.io.*;

public class TestData {
    public static void main(String[] args) throws IOException {
        File file = new File("test.dat");
        long data = 0 ;
        if(file.exists()){
            //读出来+1
            DataInputStream in = new DataInputStream(new FileInputStream("test.dat"));
            data = in.readLong();
            data++;
            in.close();
        }else{
            data = 10000L;
        }
        //写
        DataOutputStream out = new DataOutputStream(new FileOutputStream("test.dat"));
        out.writeLong(data);
        out.close();
        System.out.println(data);
    }
}
