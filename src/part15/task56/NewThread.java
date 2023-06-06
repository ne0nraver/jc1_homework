package part15.task56;

public class NewThread implements Runnable{
    Thread t;

    public NewThread() {
        t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized(this) {
            System.out.println(Thread.currentThread().getName());
        }
    }
        void start() {
            t.start();
        }
}


