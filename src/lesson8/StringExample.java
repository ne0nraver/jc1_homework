package lesson8;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = new String(new char[]{'s','1'});
        char[] ch2 = s2.toCharArray();

        System.out.println(s2.hashCode());

        s1 = s1.concat(s2);
        System.out.println(s1);

        Long l1 = 120L;//autoboxed
        long l2 = l1;//unboxing
        System.out.println(l1);
        System.out.println(l2);

    }
}
