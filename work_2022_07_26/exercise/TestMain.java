package exercise;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        List<String> list=new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(new Worker(list, "A"));
            Thread t2= new Thread(new Worker(list, "B"));
            t1.start();

            t2.start();

        }
        System.out.println(list);
    }

    private static class Worker implements Runnable{
        private List<String> list;
        private String sign;

        public Worker(List<String> list, String sign) {
            this.list = list;
            this.sign = sign;
        }

        @Override
        public synchronized void run() {
            if ("A".equalsIgnoreCase(sign)){
                list.add("A");
            }else {
                list.add("B");
            }
        }
    }
}
