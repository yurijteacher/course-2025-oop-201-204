package ua.com.kneu.lecture.creational.abstract_factoty;

public class Robot {

    private Body body;
    private Head head;
    private Hand hand;
    private Leg leg;

    public Robot(){}

    public Robot(Body body, Head head, Hand hand, Leg leg) {
        this.body = body;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "body=" + body +
                ", head=" + head +
                ", hand=" + hand +
                ", leg=" + leg +
                '}';
    }
}
