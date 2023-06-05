package part7.task30;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        boolean isTrue;
        Pattern p = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher m = p.matcher(str1);
        isTrue = m.find();
        System.out.println(isTrue);

    }
}
