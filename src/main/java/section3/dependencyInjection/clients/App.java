package section3.dependencyInjection.clients;

import section3.dependencyInjection.Vehicles.Vehicle;
import section3.dependencyInjection.parts.LargeEngine;
import section3.dependencyInjection.parts.SmallEngine;

public class App {

    public static void main(String[] args) {

        Vehicle raceCar1 = new Vehicle(new LargeEngine(500));
        Vehicle raceCar2 = new Vehicle(new SmallEngine(100));
        raceCar1.crankIgnition();
        raceCar2.crankIgnition();
    }
}
