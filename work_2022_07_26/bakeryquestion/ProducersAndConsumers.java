package bakeryquestion;

class Shop {
    private int bread = 0;

    // 生产面包
    public synchronized void produceBread() {
        if (bread < 10) {
            ++bread;
            System.out.println(Thread.currentThread().getName() + ": 开始生产第" + bread + "个面包.");
            notify(); // 唤醒消费者线程
        } else {
            try {
                wait(); // 告诉消费者等待一下
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 消费面包
    public synchronized void consumeBread() {
        if (bread > 0) {
            System.out.println(Thread.currentThread().getName() + ": 开始消费第" + bread + "个面包.");
            --bread;
            notify(); // 唤醒生产者线程
        } else {
            try {
                wait(); // 告诉消费者等待一下
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

/*
 * 生产者类
 */
class Producer extends Thread {
    private Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    public void run() {
        System.out.println(getName() + ": 开始生产面包......");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.produceBread();
        }
    }
}

/*
 * 消费者类
 */
class Consumer extends Thread {
    private Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    public void run() {
        System.out.println(getName() + ": 开始消费面包......");
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.consumeBread();
        }
    }
}


public class ProducersAndConsumers {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        producer.setName("生产者");
        Consumer consumer = new Consumer(shop);
        consumer.setName("消费者");

        producer.start();
        consumer.start();
    }
}
