package lesson11;

import java.util.Random;

public class FleetManager {

    private KiaRio KiaRio;
    private RenaultLogan Reno;
    private VwPolo Polo;

    CarDriving[] carDrivings;

/*    public FleetManager () {
        KiaRio = new KiaRio();
        Reno = new RenaultLogan();
        Polo = new VwPolo();
    }
*/
    public void setCarDrivings(CarDriving[] carDrivings) {
        this.carDrivings = carDrivings;
    }

    public void driveAll(){
        Random random_int = new Random();
        /*KiaRio.drive(random_int.nextInt(100));
        Reno.run(random_int.nextInt(100));
        Polo.go(random_int.nextInt(100));*/

        for (CarDriving carDriving: carDrivings) {
            carDriving.drive(random_int.nextInt(100));
        }

    }
}
