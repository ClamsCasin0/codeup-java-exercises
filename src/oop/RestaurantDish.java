package oop;

public class RestaurantDish {

    private int costInCents;

    private String nameOfDish;

    private boolean wouldRecommend;

    public void eat() {
        System.out.println("\"NOM NOM NOM\" The In n' Out " + nameOfDish + " costs about " + costInCents + " cents and If I told you it was good, that would be " + wouldRecommend);
    }

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}


