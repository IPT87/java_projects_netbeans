
public class Main {

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.printf("%.2f%s\n", mattsIOU.howMuchDoIOweTo("Arthur"), "€");
        System.out.printf("%.2f%s\n", mattsIOU.howMuchDoIOweTo("Michael"), "€");
        System.out.printf("%.2f%s", mattsIOU.howMuchDoIOweTo("Ahmet"), "€");
    }
}
