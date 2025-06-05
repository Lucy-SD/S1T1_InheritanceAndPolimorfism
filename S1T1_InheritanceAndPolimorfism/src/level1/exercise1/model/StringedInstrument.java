package level1.exercise1.model;

public class StringedInstrument extends Instrument {

    public StringedInstrument(String name, float price) {
        super(name, price);
    }

    public String play() {
        return "Está sonando un intrumento de cuerda.\n";
    }

    public String toString() {
        return "Soy un " + super.getName() + ", instrumento de cuerda, y valgo " + super.getPrice() + "€.\n";
    }
}
