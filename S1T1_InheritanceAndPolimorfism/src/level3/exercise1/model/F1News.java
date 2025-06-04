package level3.exercise1.model;

public class F1News extends News {

    private String team;

    public F1News(String headline, String team) {
        super(headline);
        this.team = team;
    }

    public int calculateNewsPrice() {
        super.setPrice(100);
        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            super.setPrice(super.getPrice() + 50);
        }
        return super.getPrice();
    }

    public int calculateNewsScore() {
        super.setScore(4);
        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            super.setScore(super.getScore() + 2);
        }
        return super.getScore();
    }

    public String toString() {
        return "La noticia de F1 de título \"" + super.getHeadline() + "\" habla sobre la escudería " + this.team + ".\n" +
                "Precio final: " + this.calculateNewsPrice() + "€.\nPuntuación: " + this.calculateNewsScore() + ".\n";
    }
}
