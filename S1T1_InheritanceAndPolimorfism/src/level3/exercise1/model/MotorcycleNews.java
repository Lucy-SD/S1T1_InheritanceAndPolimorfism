package level3.exercise1.model;

public class MotorcycleNews extends News {

    private String team;

    public MotorcycleNews(String headline, String team) {
        super(headline);
        this.team = team;
    }

    public int calculateNewsPrice() {
        super.setPrice(100);
        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            super.setPrice(super.getPrice() + 50);
        }
        return super.getPrice();
    }

    public int calculateNewsScore() {
        super.setScore(3);
        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            super.setScore(super.getScore() + 3);
        }
        return super.getScore();
    }

    public String toString() {
        return "La noticia de Motociclismo de título \"" + super.getHeadline() + "\" habla sobre el equipo "
                + this.team + ".\nPrecio final: " + this.calculateNewsPrice() + "€.\nPuntuación: " +
                this.calculateNewsScore() + ".\n";
    }
}