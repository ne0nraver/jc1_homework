package part15.task58;

import java.util.Random;

public class Consumer implements Runnable {

    private volatile Queue queue;
    private volatile boolean ready = false;
    //  private SomeUtil someUtil;

    public Consumer(Queue queue) {
        this.queue = queue;
        //      someUtil = new SomeUtil();
    }

    @Override
    public void run() {
        Random rand = new Random();

        while(!(ready && (queue.getElementsCount() == 0))) {
            try {
                Thread.sleep(rand.nextInt(10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (queue.getElementsCount() > 0) { queue.remove(); }
            //queue.remove();
            System.out.println("Queue elements size is: " + queue.getElementsCount());
        }
        System.out.println("Ending " + Thread.currentThread().getName());

    }

    public void shutdown() {
        ready = true;

    }
}
