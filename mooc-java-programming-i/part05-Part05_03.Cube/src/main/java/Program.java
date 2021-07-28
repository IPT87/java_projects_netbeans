
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube cube = new Cube(4);
        Cube cube1 = new Cube(2);
        
        System.out.println(cube.volume());
        System.out.println(cube1.volume());
        
        System.out.println(cube);
        System.out.println(cube1);
    }
}
