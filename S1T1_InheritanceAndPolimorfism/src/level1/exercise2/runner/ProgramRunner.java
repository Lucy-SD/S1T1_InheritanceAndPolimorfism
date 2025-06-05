package level1.exercise2.runner;

import level1.exercise2.model.Car;

public class ProgramRunner {

    public void run() {
        Car car1 = new Car("XSS500");

        System.out.println(car1.toString() + car1.speedUp());

        System.out.println(Car.stop());

        Car car2 = new Car("YTU6500");

        System.out.println(car1.toString() + car1.speedUp());
        System.out.println(car2.toString() + car2.speedUp());

        System.out.println(Car.stop());

    }
}
