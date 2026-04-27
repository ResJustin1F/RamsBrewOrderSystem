import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Beverage> beverages = new ArrayList<>();

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public void printOrder() {
        for (Beverage b : beverages) {
            System.out.println(b);
        }
    }
}
