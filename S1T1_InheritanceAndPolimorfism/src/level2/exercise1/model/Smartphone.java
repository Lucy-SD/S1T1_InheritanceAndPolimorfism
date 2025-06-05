package level2.exercise1.model;

import level2.exercise1.interfaces.Camera;
import level2.exercise1.interfaces.Clock;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public String takePic() {
        return "Se está haciendo una foto.\n";
    }

    public String alarm() {
        return "Está sonando la alarma.\n";
    }

    public String toString() {
        return super.toString() + "Soy un SmartPhone.\n";
    }
}
