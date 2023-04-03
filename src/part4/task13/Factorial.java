package part4.task13;

public class Factorial {
    public static void main(String[] args) {
        int i = 1;
        int a = 1;
        while (i <= 10) {
            a *= i;
            i++;
            System.out.println(a);
        }
    }
}
