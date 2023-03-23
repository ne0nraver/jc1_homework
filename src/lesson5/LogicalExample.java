package lesson5;

public class LogicalExample {
    public static void main(String[] args) {
        int i1 = 0;
        int i2  = 1;

        boolean result1 = i1 != 0 | i2 >= 0;
        System.out.println(result1);
        boolean result2 = i1 !=  0 || i2 > 0;
        System.out.println(result2);

        boolean result3 = i1 == 0 | compare(i2, 0);
        System.out.println(result3);
        boolean result4 = i1 ==  0 || compare(i2, 0);
        System.out.println(result4);
    }
    static boolean compare(int a, int b) {
        System.out.println("Call compare");
        return a > b;
    }
}
