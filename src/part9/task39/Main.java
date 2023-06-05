package part9.task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage<String> vehicle1 = new Garage<>();
        Garage<String> vehicle2 = new Garage<>();
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        vehicle1.setVehicle(str1);
        vehicle2.setVehicle(str2);
        System.out.println(vehicle1.getVehicle() + ", " + vehicle2.getVehicle());
    }
}
