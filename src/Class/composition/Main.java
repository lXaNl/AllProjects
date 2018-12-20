package Class.composition;

public class Main {

    public static void main(String[] args) {
        Body body = new Body(2, 2);

        Human human = new Human("John", 25, body);
        Human human1 = new Human("John", 25, new Body(2, 2));

        System.out.println(human.getBody().getHands());
    }

}
