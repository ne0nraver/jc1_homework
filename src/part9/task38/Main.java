package part9.task38;

import part9.task36.Season;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Days.getCountOfDays(Season.valueOf(str.toUpperCase()));
    }
}

