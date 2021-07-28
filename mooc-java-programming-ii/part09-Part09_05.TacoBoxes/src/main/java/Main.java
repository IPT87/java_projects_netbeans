
public class Main {

    public static void main(String[] args) {
        TripleTacoBox ttb = new TripleTacoBox();
        System.out.println("Tacos: " + ttb.tacosRemaining());
        ttb.eat();
        System.out.println("Tacos: " + ttb.tacosRemaining());
        ttb.eat();
        System.out.println("Tacos: " + ttb.tacosRemaining());
        ttb.eat();
        System.out.println("Tacos: " + ttb.tacosRemaining());
        ttb.eat();
        System.out.println("Tacos: " + ttb.tacosRemaining());
    }
}
