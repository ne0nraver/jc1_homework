package lesson9;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.sql.*;

public class DateTimeExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

        java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
        System.out.println(sqlDate);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(localDate.getEra());
    }
}
