package exercise.thread;

public class TestThread3 {

    public static void main(String[] args) throws InterruptedException {
        final Object o=new Object();


            Thread t1=new Thread(new A1Thread());
            Thread t2=new Thread(new A2Thread());
            Thread t3=new Thread(new A3Thread());

            
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();

    }
}
class A1Thread implements Runnable{
    @Override
    public void run() {
        Thread thread=Thread.currentThread();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
class A2Thread implements Runnable{
    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
class A3Thread implements Runnable{
    @Override
    public void run() {
        for (int i = 21; i <= 30; i++) {
            System.out.println(i);
        }
    }
}