
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(3);
        Counter count = new Counter();
        
        counter.decrease();
        counter.decrease(3);
        counter.increase();
        counter.increase(5);
        
        count.decrease();
        count.decrease(4);
        count.increase();
        count.increase(7);
        
        System.out.println(counter);
        System.out.println(count);
    }
}
