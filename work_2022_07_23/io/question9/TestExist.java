package io.question9;

import java.io.*;

public class TestExist {
    public static void main(String[] args) {

        //exists
        File file = new File("test.txt");
        if (!file.exists()) {
            try (
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
            ) {
                wirte(out);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (
                    BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
            ) {
                show(file, in);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void show(File file, BufferedInputStream in) {
        BufferedOutputStream out=null;
        try {
           byte[] bytes=new byte[1024];
            int index=0,size=0;
            while ( (bytes[index++]=(byte) in.read())!= -1) {
            }

            for (int i = 0; i < bytes.length; i++) {
                if(bytes[i]!=-1)size++;
                else break;
            }

            byte[] newBytes=new byte[size];
           System.arraycopy(bytes,0,newBytes,0,size);
            newBytes[size-1]+=1;

           out = new BufferedOutputStream(new FileOutputStream(file));
            out.write(newBytes);
            System.out.println(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (out!=null)try {
                out.close();
            }catch (Exception e){}
        }
    }


    private static void wirte(BufferedOutputStream out) throws IOException {
        long a = 10000L;
        byte[] bytes = String.valueOf(a).getBytes();
        out.write(bytes);
        System.out.println("2");

    }

}
