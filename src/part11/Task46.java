package part11;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        try {
            System.out.println(div (a, b));
        } catch (ArithmeticException e) {
            System.out.println("Can't div by zero");
        }
    }
    public static double div (double a, double b) {
        return a/b;
    }
}
