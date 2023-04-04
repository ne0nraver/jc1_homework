package lesson8;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        String s4 =s3.intern();
        System.out.println("s1==s2: " + (s1==s2));
        System.out.println("s1==s3: " + (s1==s3));
        System.out.println("s1==s4: " + (s1==s4));
    }
}
