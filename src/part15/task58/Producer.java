package part15.task58;

import java.util.Random;

public class Producer implements Runnable{
    private Queue queue;
    private volatile boolean ready = false;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while(!ready) {
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.add(rand.nextInt(100));
            System.out.println("Queue elements size is: " + queue.getElementsCount());
        }
        System.out.println(" Ending " + Thread.currentThread().getName());
    }

    public void shutdown() {
        ready = true;

    }
}
