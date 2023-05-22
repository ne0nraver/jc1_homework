package lesson17;

public class Main {
    public static void main(String[] args) {

        System.out.println("My current thread: " + Thread.currentThread().getName());

        HelloThread helloThread = new HelloThread("HelloWorld");
        System.out.println("State of helloWorld: " + helloThread.getState());
        helloThread.run();
        helloThread.start();
        System.out.println("State of helloWorld: " + helloThread.getState());

        new HelloThread("HelloWorld2").start();

    }
}

class HelloThread extends Thread {

    public HelloThread(String name) {
        super(name);
    }

    public void run(){
        System.out.println("From run() - My current thread: " + Thread.currentThread().getName());
    }
}
