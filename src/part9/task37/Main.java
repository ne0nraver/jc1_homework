package part9.task37;

import java.util.Scanner;
import part9.task36.Season;

public class Main {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String str = s.nextLine();
        NextSeason.nextSeason(Season.valueOf(str.toUpperCase()));
    }
}
