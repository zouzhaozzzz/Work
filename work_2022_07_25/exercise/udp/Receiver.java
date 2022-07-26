package exercise.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) {

        try(
                DatagramSocket ds = new DatagramSocket(8080)
        ){
            byte[] buffer =new byte[1024];
            DatagramPacket dp=new DatagramPacket(buffer,buffer.length);

            String msg;
            do {
                ds.receive(dp);

                byte[] data = dp.getData();
                msg = new String(data, 0, dp.getLength());
                System.out.println(msg);
            }while (!"q".equalsIgnoreCase(msg));


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
