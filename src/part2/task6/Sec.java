package part2.task6;
import java.util.Scanner;
public class Sec {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество секунд: ");
            int s = sc.nextInt();
            int sec;
            int m;
            int min, h, hour;
            int week, d, day;
            sec = s % 60;
            m = (s - sec) / 60;
            min = m % 60;
            h = (m - min) / 60;
            hour = h % 24;
            d = (h - hour) / 24;
            day = d % 7;
            week = (d - day) / 7;
            System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");
    }

}
