package part9.task38;

import part9.task36.Season;

public class Days {
    static void getCountOfDays(Season str) {

            int i  = 0;
            switch (str) {
                case AUTUMN:
                    i = Season.AUTUMN.getCountOfDays();
                    break;
                case SPRING:
                    i = Season.SPRING.getCountOfDays();
                    break;
                case SUMMER:
                    i = Season.SUMMER.getCountOfDays();
                    break;
                case WINTER:
                    i = Season.WINTER.getCountOfDays();
                    break;
            }
            System.out.println(i + " days");
    }
}
