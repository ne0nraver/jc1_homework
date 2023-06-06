package part15.task56;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NewThread t1 = new NewThread();
        t1.start();
        Thread.sleep(2000);
        NewThread t2 = new NewThread();
        t2.start();
        Thread.sleep(2000);
        NewThread t3 = new NewThread();
        NewThread t4 = new NewThread();
        NewThread t5 = new NewThread();
        NewThread t6 = new NewThread();
        NewThread t7 = new NewThread();
        NewThread t8 = new NewThread();
        NewThread t9 = new NewThread();
        NewThread t10 = new NewThread();


        t3.start();
        Thread.sleep(2000);
        t4.start();
        Thread.sleep(2000);
        t5.start();
        Thread.sleep(2000);
        t6.start();
        Thread.sleep(2000);
        t7.start();
        Thread.sleep(2000);
        t8.start();
        Thread.sleep(2000);
        t9.start();
        Thread.sleep(2000);
        t10.start();
    }
}
