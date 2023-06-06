package part14.task55;

public class Main {
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        NewThread t2 = new NewThread();
        NewThread t3 = new NewThread();
        NewThread t4 = new NewThread();
        NewThread t5 = new NewThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
