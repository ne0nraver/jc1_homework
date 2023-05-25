package lesson19;

import java.io.*;
import java.util.List;
import java.util.Properties;

public class CarController {

    public List<CarValueObject> readFromFile(File file) throws IOException {
        new BufferedReader(new FileReader(file))
                .lines()
                .forEach(System.out::println);

        return null;
    }

    public static void main(String[] args) {
        try {
            CarController controller = new CarController();
            controller.readFromFile(new File("c:/repo/resources/bmw_car.csv"));
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
