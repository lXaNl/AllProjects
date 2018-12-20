package Class.composition;

public class Body {

    private int legs;

    private int hands;

    public Body(int legs, int hands) {
        this.legs = legs;
        this.hands = hands;
    }

    public Body() {
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Body{" +
                "legs=" + legs +
                ", hands=" + hands +
                '}';
    }
}
