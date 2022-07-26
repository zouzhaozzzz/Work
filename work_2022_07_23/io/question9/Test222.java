package io.question9;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Test222 {
    public static void main(String[] args) {

        try (
                FileOutputStream out =new FileOutputStream("test.txt");
                FileInputStream in = new FileInputStream("test.txt");
        ){
            byte[] bytes = new byte[10];

//            int read = in.read(bytes);
//            System.out.println(Arrays.toString(bytes));


            out.write(12);
//            int read2 = in.read(bytes);
//            System.out.println(Arrays.toString(bytes));


            out.write(26);
            int read3 = in.read(bytes);


            System.out.println(Arrays.toString(bytes));

//            System.out.println(read);
//            System.out.println(read2);
//            System.out.println(read3);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void demo(){
        try (
                FileInputStream in = new FileInputStream("test.txt");
        ){

            byte[] bytes = new byte[10];
            int read = in.read(bytes);
            System.out.println(Arrays.toString(bytes));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
