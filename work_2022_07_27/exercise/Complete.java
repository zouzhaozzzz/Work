package exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Complete {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future<List>> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            int final1 = i;
            Future<List> future = pool.submit(() -> {

                List number = judge(final1);
                return number;
            });
            list.add(future);
        }
        int res = 0;
        List<Number> list1 = new ArrayList<>();
        for (Future<List> i : list) {
             list1 = i.get();
            res += list1.size();
        }
        pool.shutdown();
        System.out.println(res);

    }

@Test


    public static List judge(int b){
        List<Integer> list=new ArrayList();
        for (int i=1000*b-999;i<=b*1000;i++) {                 //数的范围
            boolean a = true;//设立一个判断点
            if (i==1)continue;
            for (int j = 2; j <=Math.sqrt(i); j++){  //判断是否是素数
                if(i%j==0){
                    a=false;
                    break;
                }
            }
            //判断点来确定素数，然后输出-
            if(a) list.add(i);

        }
        return list;
    }
}
