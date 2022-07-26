package io.question9;

import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream fis = new DataOutputStream((new FileOutputStream("test.txt")));
        long n=10000L;
        fis.writeLong(n);
        fis.flush();
//       fis.close();
        DataInputStream fus=new DataInputStream(new FileInputStream("test.txt"));
        try {
            long l=fus.readLong();
            System.out.println(l);

//           fis = new DataOutputStream((new FileOutputStream("test.txt")));
//          fus=new DataInputStream(new FileInputStream("test.txt"));
            fis.writeLong(n+1);
            long l1=fus.readLong();

            fus.close();
            fis.close();
            System.out.println(l1);
        }catch (IOException e){
e.printStackTrace();
        }


        DataInputStream fus2=new DataInputStream(new FileInputStream("test.txt"));
        long l2=fus2.readLong();
        System.out.println(l2);
        fus2.close();
    }
}
