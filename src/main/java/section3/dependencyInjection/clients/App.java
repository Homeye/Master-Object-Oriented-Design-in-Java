package section3.dependencyInjection.clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import section3.dependencyInjection.vehicles.Vehicle;
import section3.dependencyInjection.parts.LargeEngine;
import section3.dependencyInjection.parts.SmallEngine;

public class App {

    public static void main(String[] args) {

        Vehicle raceCar1 = new Vehicle(new LargeEngine(500));
        Vehicle raceCar2 = new Vehicle(new SmallEngine(100));
        raceCar1.crankIgnition();
        raceCar2.crankIgnition();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle smallCar = (Vehicle) context.getBean("mrBeansCarSmall");
        smallCar.crankIgnition();
        Vehicle largeCar = (Vehicle) context.getBean("mrBeansCarLarge");
        largeCar.crankIgnition();
    }
}
