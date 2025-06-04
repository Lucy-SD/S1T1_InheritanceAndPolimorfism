package level3.exercise1.model;

abstract public class News {

    private String headline;
    private String body;
    private int score;
    private int price;

    public News(String headline) {
        this.headline = headline;
        this.body = "";
        this.score = 0;
        this.price = 0;
    }

    public String getHeadline() {
        return this.headline;
    }
    public int getScore() {
        return this.score;
    }
    public int getPrice() {
        return this.price;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    abstract int calculateNewsScore();
    abstract int calculateNewsPrice();

    public String toString() {
        return "Titular: " + this.headline + ".\nPuntuación: " + this.score + ".\nPrecio: " + this.price + "€.\n";
    }

}
