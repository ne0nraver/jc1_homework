package lesson9;

public class SBExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("sb1");
        StringBuilder sb2 = new StringBuilder("sb1");

        System.out.println(sb1.compareTo(sb2));

        sb2.append("12345");
        System.out.println(sb1.compareTo(sb2));
    }
}
