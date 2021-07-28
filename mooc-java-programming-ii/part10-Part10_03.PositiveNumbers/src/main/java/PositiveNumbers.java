
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-6);
        numbers.add(4);
        numbers.add(12);
        numbers.add(5);
        numbers.add(-3);
        numbers.add(-1);
        
        System.out.println(positive(numbers));

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(element -> element >= 0).collect(Collectors.toList());
    }

}
