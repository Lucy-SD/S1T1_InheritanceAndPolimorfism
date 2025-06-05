package level1.exercise2.model;

public class Car {

    static final String BRAND = "MiMarca";
    static String model;
    private final int POWER ;

    public Car(String model) {
        Car.model = model;
        this.POWER = 1800;

    }

    static String getBrand() {
        return Car.BRAND;
    }

    static String getModel() {
        return Car.model;
    }

    public int getPower() {
        return this.POWER;
    }

    static void setModel(String model) {
        Car.model = model;
    }

    public static String stop() {
        return "El vehículo " + Car.model + " está frenando.";
    }

    public String speedUp() {
        return "El vehículo " + Car.model + " está acelerando.";
    }

    public String toString() {
        return "El auto de la marca " + Car.BRAND + " es del modelo " + Car.model + " y tiene una potencia de "
                + this.POWER + ".\n";
    }
}
