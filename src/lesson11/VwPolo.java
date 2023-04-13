package lesson11;

public class VwPolo implements CarDriving{

    private int kilometers;

    public int drive(int kilometer) {
        kilometers += kilometer;
        System.out.println("Polo drives: " + kilometer + " total: " + kilometers);
        return kilometers;
    }

}
