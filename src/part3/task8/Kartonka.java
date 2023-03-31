package part3.task8;

import java.util.Scanner;

public class Kartonka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте стороны отверстия:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Задайте радиус картонки:");
        int r = sc.nextInt();
        if (r >= a && r >= b)
            System.out.println("Картонка закрывает отверстие!!");
        else System.out.println("У картонки маленький радиус, увы(");
    }
}
