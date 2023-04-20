package part7.task27;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = str.length();
        int b = str.replaceAll("\\p{Punct}", "").length();
        System.out.println(a - b);
        }
}
