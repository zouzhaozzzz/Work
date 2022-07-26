package exercise.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) {
            try(
                    DatagramSocket ds=new DatagramSocket()
                    ){
                String msg;
                while (!"q".equalsIgnoreCase(msg=new Scanner(System.in).next())){
                    byte[] data=msg.getBytes();
                    DatagramPacket dp=new DatagramPacket(data,0,data.length,InetAddress.getByName("127.0.0.1"),8080);
                    ds.send(dp);
                }

            }catch (Exception e){
                e.printStackTrace();
            }
    }

}

