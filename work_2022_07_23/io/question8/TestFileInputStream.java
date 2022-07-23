package io.question8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) {
        FileOutputStream out = null;
        FileInputStream in = null;
        try {


            out = new FileOutputStream("test.txt", true);
            in =new FileInputStream("test.txt");

            byte[] bytes = "Hello World".getBytes();

            out.write(bytes);

            byte[] buffer = new byte[1024];

            if ( in.read(buffer)!=-1){
                System.out.print(new String(buffer));
            }

        } catch (Exception e) {

        } finally {
            if (out != null) try {
                out.close();
            } catch (Exception e) {

            } finally {
                if (in != null)
                    try {
                        in.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            }
        }

    }
}
