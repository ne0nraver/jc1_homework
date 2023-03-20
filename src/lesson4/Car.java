package lesson4;

import java.awt.*;

public class Car {

    public Car(int price) {
        System.out.println(price);
    }

    Color color;
    String model;

    public static void main(String[] args) {
        Car bmwX6, audiA8;

        bmwX6 = new Car(100_000);
        bmwX6.color = Color.CYAN;
        bmwX6.model = "BMW X6";
        Car bmw_second;
        bmw_second = bmwX6;
        //bmwX6 = null; //bmwX6 уже не востребована из за  null

        System.out.println(bmw_second.model + "" + bmw_second.color);
       // System.out.println(bmwX6.model + "" + bmwX6.color); // error of runtime (NPE - remember abbr) from 22

        audiA8 = new Car(70_000);
        audiA8.color = Color.GRAY;
        audiA8.model = "AUDI A8";

    }
}
