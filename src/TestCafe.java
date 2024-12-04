import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        // Create instance named appTest from class CafeUtil
        CafeUtil appTest = new CafeUtil();

        /* ============== App Test Cases ============ */
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        System.out.println("\n----- Order Total Test -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(lineItems));

        System.out.println("\n----- Display Menu Test -----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test -----");
        ArrayList<String> customers = new ArrayList<String>();
        for (int i=0;i<4;i++) {
            appTest.addCustomer(customers);
            System.out.print("\n");
        }


    }
}
