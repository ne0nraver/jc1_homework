package lesson11;

public class KiaRio implements CarDriving{

    private int km;

    public int drive(int distance) {
        km += distance;
        System.out.println("Kia drives distance: " + distance + " total:" + km);
        return km;
    }

}
