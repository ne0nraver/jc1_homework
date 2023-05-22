package lesson18;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyLambda {
    public static void main(String[] args) throws Exception {

       doCalculation(() -> 123.45);
       doCalculation(() -> new Random().nextDouble());
       doCalculation(new MyLambda()::myMethod);
       doCalculation(MyLambda::myStaticMethod2);
       }


    Double myMethod() {
        return 123.45;
    }

    static Double myStaticMethod2() {
        return 123.45;
    }


    public static void doCalculation(Callable<Double> doubleCallable) throws Exception {
        Double result = doubleCallable.call();
        System.out.println(result);
    }
}
