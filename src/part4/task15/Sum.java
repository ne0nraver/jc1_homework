package part4.task15;

public class Sum {
    public static void main(String[] args) {
        long a = 7893823445L;
        long i  = 0;
        do {
            i = i + a % 10;
            a = a / 10;
            System.out.println(i);
    } while (a > 0);
}
}
