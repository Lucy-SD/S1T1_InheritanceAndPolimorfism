package level3.exercise1.model;

public class BasketballNews extends News {

    private String competition;
    private String club;

    public BasketballNews(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
    }

    public int calculateNewsPrice() {
        super.setPrice(250);
        if (this.competition.equalsIgnoreCase("Euroliga")) {
            super.setPrice(super.getPrice() + 75);
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            super.setPrice(super.getPrice() + 75);
        }
        return super.getPrice();
    }

    public int calculateNewsScore() {
        super.setScore(4);
        if (this.competition.equalsIgnoreCase("euroliga")) {
            super.setScore(super.getScore() + 3);
        } else if (this.competition.equalsIgnoreCase("ABC")) {
            super.setScore(super.getScore() + 2);
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            super.setScore(super.getScore() + 1);
        }
        return super.getScore();
    }
}
