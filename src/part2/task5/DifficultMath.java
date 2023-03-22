package part2.task5;

public class DifficultMath {
    static int sam(int a, int b) {
        int c;
        c = (a + b) + a * b;
        return c;
    }
    public static void main(String[] args) {
        int x;
        x = sam(13,54);
        System.out.println("x = " + x);
        int y = sam(2,17);
        System.out.println("y = " + y);
    }
}
