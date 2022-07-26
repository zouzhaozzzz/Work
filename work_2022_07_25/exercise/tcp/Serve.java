package exercise.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve {
    public static void main(String[] args) {
        try (
                ServerSocket ss = new ServerSocket(8080);
                Socket socket = ss.accept();
                InputStream in = socket.getInputStream()
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) != -1) {
                String msg = new String(buffer, 0, len);
                if ("q".equalsIgnoreCase(msg))break;
                    System.out.println(msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
