package part7.task31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1 = str1.replaceAll("(<p>|<p[^<>]+>) ", "<p> ");
        System.out.println(str1);
    }
}
