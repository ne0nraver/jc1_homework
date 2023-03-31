package part3.task9;

public class Roubles {
    public static void main(String[] args) {
        int rub = 64;
        if (rub % 10 == 1) System.out.println(rub + " рубль");
        else if (rub % 10 > 1 && rub % 10 <= 4) System.out.println(rub + " рубля");
        else System.out.println(rub + " рублей");
    }
}
