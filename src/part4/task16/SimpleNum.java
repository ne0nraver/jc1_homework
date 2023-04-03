package part4.task16;

public class SimpleNum {
    public static void main(String[] args) {
        boolean a;
        boolean b = false;
        for (int i = 50; i <= 70; i++) {
            a = true;
            for (int r = 2; r < i;r++){
                if (i % r == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                if (b) {
                    System.out.println(i);
                    break;
                }
                b = true;
            }
        }
    }
}
