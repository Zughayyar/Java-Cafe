import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i=1;i<=10;i++) {
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i=0;i<prices.length;i++) {
            total += prices[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i=0;i<menuItems.size();i++) {
            System.out.println(i + "  " + menuItems.get(i));

        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Enter your name please");
        String username = System.console().readLine();
        customers.add(username);
        System.out.printf("Hello, %s.", username);
        System.out.printf("\nThere are %s people in front of you", customers.size());
    }
}