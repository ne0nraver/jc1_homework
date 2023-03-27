package lesson6;

public class BreakExample {
    public static void main(String[] args) {
        int i = 17;
        while ( i <=28) {
            if (i % 13 == 0){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
