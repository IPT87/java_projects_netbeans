
import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Thirs");
        
        System.out.println(returnSize(list));
        
    }

    public static int returnSize(List list) {
        return list.size();
    }
}
