package exercise;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Prime {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future<Integer>> list=new ArrayList<>();
        for (int i = 1; i < 4; i++) {

            int finalI = i;
            Future<Integer> future = pool.submit(() -> {
                return findPrimeNumber(finalI *1000-999, finalI *1000);
            });
            list.add(future);
        }
        int res=0;
        for (Future<Integer> future : list) {
            System.out.println(future.get());
            res+=future.get();
        }
        System.out.println(res);

    }

    private static int findPrimeNumber(int m, int n) {

        int count=0;

        for (int i = m; i <= n; i++) {
            boolean flag=true;
            if (i==1) continue;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    flag=false;
                    break;
                }
            }
            if (flag)count++;
        }
        return count;
    }
}
