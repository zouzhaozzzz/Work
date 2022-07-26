package exercise;

import java.util.ArrayList;
import java.util.List;

public class ProblemMain {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        List<Thread> tasks=new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Thread t=new Thread(new Task(c));
            tasks.add(t);
            t.start();
            // t.join();
        }

        for (Thread task : tasks) {
            task.join();
        }
        System.out.println(c.total);
    }

    private static class Counter{
        private int total;
        public void increment(){
            synchronized (this){

                total++;
            }
        }
    }
    private static class Task implements Runnable{
        private Counter counter;
        @Override
        public void run() {
            for (int i=0;i<10000;i++) {
                counter.increment();
            }
        }

        public Task(Counter counter) {
            this.counter=counter;
        }

    }
}
