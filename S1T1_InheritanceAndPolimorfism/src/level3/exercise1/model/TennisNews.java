package level3.exercise1.model;

public class TennisNews extends News {

    private String competition;
    private String player;

    public TennisNews(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
    }

    public int calculateNewsPrice() {
        super.setPrice(150);
        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") ||
                this.player.equalsIgnoreCase("Djokovic")) {
            super.setPrice(getPrice() + 100);
        }
        return super.getPrice();
    }

    public int calculateNewsScore() {
        super.setScore(4);
        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") ||
                this.player.equalsIgnoreCase("Djokovic")) {
            super.setScore(getScore() + 3);
        }
        return super.getScore();
    }

    public String toString() {
        return "La noticia de Tenis de título \"" + super.getHeadline() + "\" habla sobre la competición " + this.competition
                + ", del jugador " + this.player + ".\nPrecio final: " + this.calculateNewsPrice() + "€.\nPuntuación:"
                + this.calculateNewsScore() + ".\n";
    }
}
