package part9.task36;

public class Main {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer.getDescription());
        System.out.println("Количество дней в сезоне: " + summer.getCountOfDays());
        Season autumn = Season.AUTUMN;
        System.out.println(autumn.getDescription());
        System.out.println("Количество дней в сезоне: " + autumn.getCountOfDays());
        Season winter = Season.WINTER;
        System.out.println(winter.getDescription());
        System.out.println("Количество дней в сезоне: " + winter.getCountOfDays());
        Season spring = Season.SPRING;
        System.out.println(spring.getDescription());
        System.out.println("Количество дней в сезоне: " + spring.getCountOfDays());
    }
}
