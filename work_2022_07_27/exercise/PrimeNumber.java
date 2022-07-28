package exercise;

import java.util.concurrent.*;

public class PrimeNumber {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {

            return findPrimeNumber(1, 1000);
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {

            return findPrimeNumber(1001, 2000);
        });
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {

            return findPrimeNumber(2001, 3000);
        });
        System.out.println(future.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        int res=future.get()+future2.get()+future3.get();
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
