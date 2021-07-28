

public class Exercise3 {
    public static void main(String[] args) {
        Food food1 = new Food("Pizza", 30);
        Food food2 = new Food("Salad", 8);
        Food food3 = new Food("Eggs", 9);
        Food food4 = new Food("Sushi", 12);
        Food food5 = new Food("Fish", 18);
        
        Kitchen kitchen = new Kitchen();
        kitchen.addOrder(food1);
        kitchen.addOrder(food2);
        kitchen.addOrder(food3);
        kitchen.addOrder(food4);
        kitchen.addOrder(food5);
        
        kitchen.orders().forEach(f -> System.out.println(f));
        kitchen.cookShortest();
        kitchen.orders().forEach(f -> System.out.println(f));
        kitchen.cookByName("Pizza");
        kitchen.orders().forEach(f -> System.out.println(f));
        kitchen.cookByName("Eggs");
        kitchen.orders().forEach(f -> System.out.println(f));
    }
}
