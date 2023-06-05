package part9.task37;


import part9.task36.Season;

public class NextSeason {

    static void nextSeason(Season str) {
        String str1 = "";
        switch (str) {
            case AUTUMN:
                str1 = Season.WINTER.toString();
                break;
            case SPRING:
                str1 = Season.SUMMER.toString();
                break;
            case SUMMER:
                str1 = Season.AUTUMN.toString();
                break;
            case WINTER:
                str1 = Season.SPRING.toString();
                break;
        }
        System.out.println(str1);
    }
}
