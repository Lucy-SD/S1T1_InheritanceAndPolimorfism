package level1.exercise1.model;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, float price) {
        super(name, price);
    }

    public String play() {
        return "Está sonando un instrumento de viento.\n";
    }

    public String toString() {
        return "Soy un " + super.getName() + ", instrumento de viento, y valgo " + super.getPrice() + "€.\n";
    }
}
