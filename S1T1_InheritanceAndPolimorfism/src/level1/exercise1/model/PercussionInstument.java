package level1.exercise1.model;

public class PercussionInstument extends Instrument {

    public PercussionInstument(String name, float price) {
        super(name, price);
    }

    public String play() {
        return "Esta sonando un instrumento de percusión.\n";
    }

    public String toString() {
        return "Soy un " + super.getName() + ", instrumento de percusión, y valgo " + super.getPrice() + "€.\n";

    }
}
