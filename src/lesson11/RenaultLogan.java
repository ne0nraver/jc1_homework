package lesson11;

public class RenaultLogan implements CarDriving{
    private int mileage;

    public int drive(int distance) {

        mileage += distance;
        System.out.println("Renaul drives " + distance +  " total: " + mileage);
        return mileage;
    }

}
