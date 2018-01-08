package section3.dependencyInjection.Vehicles;

import section3.dependencyInjection.parts.Engine;

public class Vehicle {

    private Engine myEngine;

    public Vehicle(Engine myEngine) {
        this.myEngine = myEngine;
    }

    public void crankIgnition() {
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
