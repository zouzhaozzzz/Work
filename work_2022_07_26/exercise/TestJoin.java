package exercise;

import java.util.Date;
import java.util.Random;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Date d1 = new Date();
            Thread t=new Thread(new Task());
            t.start();
            t.join();
            Date d2 = new Date();
            System.out.println(d2.getTime()-d1.getTime());
        }
        System.out.println("结束");
    }
    private static class Task implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep((new Random().nextInt(2000)+2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
