package exercise;

public class TestVolatile {

    public static void main(String[] args) throws InterruptedException {
        Container container = new Container();
        Thread t1=new Thread(new Task(container));
        t1.start();
        // t1.join();
        Thread t2=new Thread(()->{
            while (!container.isDone()){}
            System.out.println(container.getTotal());
        });
        t2.start();

    }


    private static class Task implements Runnable{
        private Container container;

        public Task(Container container) {
            this.container = container;
        }

        @Override
        public void run() {
            for (int i=0;i<1_000_000;i++) {
                if (Thread.currentThread().isInterrupted()) return;
                    container.increment();
            }
                container.setDone(true);
        }
    }


    private static class Container{
        private int total;
        //从主存中RAm读取，而不是缓存Cache
        private volatile boolean done;

        public void increment(){
            total++;
        }

        public void setDone(boolean done) {
            this.done = done;
        }

        public boolean isDone(){
            return done;
        }

        public int getTotal() {
            return total;
        }
    }
}
