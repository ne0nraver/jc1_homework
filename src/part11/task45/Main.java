package part11.task45;

import java.util.Scanner;

public class Main {
    public static void addNum(int n) throws MyException {
        if (n > 100000) {
            throw new MyException("много цифр, не хочу считать");
        } else System.out.println("ладно, босс");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        try {
           Main.addNum(num);
        } catch (MyException e) {
            System.out.println(e);;
        }
    }
}
