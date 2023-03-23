package lesson5;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(2 + 2);
        System.out.println("2" + "2");
        System.out.println('4' * '5');
        System.out.println(52 * 53);  // коды символов 4 и 5
        System.out.println(0x34 * 0x35);  // коды 16тиричные 4 и 5
        System.out.println(0b100 * 0b101); // binary
        System.out.println(Integer.toOctalString(01 + 07));  // octal
        System.out.println((float)9/2);
        System.out.println(7%5);
        int i = 0;
        System.out.println(i++);
        System.out.println(++i);

    }
}
