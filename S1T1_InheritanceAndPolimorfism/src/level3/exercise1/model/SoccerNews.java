package level3.exercise1.model;

public class SoccerNews extends News {
    private String competition;
    private String club;
    private String player;

    public SoccerNews(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    public int calculateNewsScore() {
        super.setScore(5);
        if (this.competition.equalsIgnoreCase("liga de campeones")) {
            super.setScore(super.getScore() + 3);
        } else if (this.competition.equalsIgnoreCase("liga")) {
            super.setScore(super.getScore() + 2);
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            super.setScore(super.getScore() + 1);
        }
        if (this.player.equalsIgnoreCase("Torres") || this.player.equalsIgnoreCase("benzema")) {
            super.setScore(super.getScore() + 1);
        }
        return super.getScore();
    }
    public int calculateNewsPrice() {
        super.setPrice(300);
        if (this.competition.equalsIgnoreCase("liga de campeones")) {
            super.setPrice(super.getPrice() + 100);
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            super.setPrice(super.getPrice() + 100);
        }
        if (this.player.equalsIgnoreCase("Torres") || this.player.equalsIgnoreCase("benzema")) {
            super.setPrice(super.getPrice() + 50);
        }
        return super.getPrice();
    }

    public String toString() {
        return "La noticia de Futbol de título \"" + super.getHeadline() + "\" habla sobre la competición " + this.competition
                + ", del equipo " + this.club + " y el jugador " + this.player + ".\nPrecio final: " +
                this.calculateNewsPrice() + "€.\nPuntuación: " + this.calculateNewsScore() + ".\n";
    }


}
