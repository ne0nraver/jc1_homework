package lesson18;

import java.util.Date;
import java.util.concurrent.*;

public class MyExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        final Future<Date> future = executorService.submit(new CurrentDatePrinter());
        String s = "Hello from hell ";
        System.out.println(s + Thread.currentThread().getName());
        final Future<Date> future1 = executorService.submit( () -> {
            Date date = new Date();
            System.out.println(date);
            System.out.println(Thread.currentThread().getName());
            System.out.println(s + Thread.currentThread().getName());
            return date;

        });

            Date datefromfuture = future.get();
            System.out.println("Date from future: " + datefromfuture);


            executorService.shutdown();
       }
}

class CurrentDatePrinter implements Callable<Date> {

    @Override
    public Date call() throws Exception {
        Date date = new Date();
        System.out.println(date);
        System.out.println(Thread.currentThread().getName());
        return date;
    }
}
