package lesson11;

public class Main {
    public static void main(String[] args) {
        CarDriving[] cars = {
                new KiaRio(),
                new RenaultLogan(),
                new VwPolo(),
                new KiaRio()
        };

        FleetManager fleetManager = new FleetManager();
        fleetManager.setCarDrivings(cars);
        fleetManager.driveAll();

        //Auto myAuto = new Auto();
    }
}
