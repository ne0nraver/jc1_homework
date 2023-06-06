package part9.task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage<Car> car = new Garage<>();
        Garage<Motorcycle> moto = new Garage<>();
        car.enterVeh();
        moto.enterVeh();
        System.out.println(car.getName());
        System.out.println(moto.getName());
    }
}
