package bakeryquestion;

public class Test {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        Thread t = new Thread(bakery);
        Thread t2 = new Thread(new Consumer(bakery));
        t.start();
        t2.start();

    }

    private static class Bakery implements Runnable {
        int count;

        @Override
        public void run() {
            System.out.println("Bakery线程启动");
            while (true) {
                //500毫秒抢一次线程
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (this) {

                    if (count <100) {
                        // 面包足够

                        count++;
                        System.out.println("1生产了一个面包，总共有" + count);
                        notifyAll();// 生产了面包，告诉消费者可以购买了

                    } else {
                        // 面包不够
                        count++;
                        System.out.println("2生产了一个面包，总共有" + count);
                        try {
                            wait();// 生产了面包，告诉消费者可以购买了
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }

            }

        }
    }


    private static class Consumer implements Runnable {
        private Bakery bakery;

        @Override
        public void run() {
            System.out.println("Consumer线程启动");
            while (true) {
                //1200毫秒抢一次线程
                try {
                    Thread.sleep(200);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (bakery) {
                    if (bakery.count > 0) {
                        System.out.println("顾客买了一个面包");
                        bakery.count--;
                        bakery.notifyAll();// 消费完了一个面包，相当于减少一个信号量，告诉生产者要生产了
                    } else {
                        System.out.println("面包不够");
                        try {
                            bakery.wait();  // 面包不够，告诉生产者要生产面包了
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }

                }

            }

        }

        public Consumer(Bakery bakery) {
            this.bakery = bakery;
        }
    }


}
