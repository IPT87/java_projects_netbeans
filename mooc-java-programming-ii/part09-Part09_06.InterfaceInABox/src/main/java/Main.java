
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);
        Box sBox = new Box(10);
        sBox.add(new Book("Will Smith", "I president!", 0.7));
        box.add(sBox);

        System.out.println(box);
    }

}
