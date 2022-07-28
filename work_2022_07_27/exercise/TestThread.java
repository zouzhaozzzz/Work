package exercise;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThread {

    public static void main(String[] args) {
        int poolSize=Runtime.getRuntime().availableProcessors()-1;
        ExecutorService pool=null;
        try {
             pool = Executors.newFixedThreadPool(poolSize);
            int[][] res = new int[10][2];
            for (int i = 0; i < 10; i++) {
                System.out.println(1);
                Future<int[]> future=pool.submit(
                        ()->{
                            int time=new Random().nextInt(3000)+2000;
                            Thread.sleep(time);
                            System.out.println(2);
                            int num = new Random().nextInt(100);
                            return new int[]{num,time};
                        });
                System.out.println(3);
                int[]ints = future.get();//阻塞
                res[i][0]=ints[0];
                res[i][1]=ints[1];
                System.out.println(4);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (pool!=null)pool.shutdown();
        }
    }


}
