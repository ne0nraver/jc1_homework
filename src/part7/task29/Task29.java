package part7.task29;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\d", "");
        str = str.replaceAll("\\p{Punct}", "");
        str = str.replaceAll("\\s{2,}", " ");
        StringBuilder s = new StringBuilder();
        String[] m = str.split(" ");
        for (String a: m) {
            s.append(a.charAt(a.length()-1));
        }
        System.out.println(s);
    }
}
