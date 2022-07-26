package exercise.tcp;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8080);
                OutputStream out = socket.getOutputStream()
        ) {
            Scanner scan = new Scanner(System.in);
            String msg;
            while (!"q".equalsIgnoreCase(msg = scan.next())) {
                out.write(msg.getBytes());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
