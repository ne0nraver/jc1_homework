package part7.task28;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = s.strip();
        int y = a.replaceAll("\\s{2,}", " ").length();
        int x = a.replaceAll("\\s", "").length();
        System.out.println(y - x +1);
    }
}
