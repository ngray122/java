import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil cafeUtil = new CafeUtil();

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafeUtil.getStreakGoal(10));
        // String testTheMethod = cafeUtil.testMethod();
        // int testGetStreakGoal = cafeUtil.getStreakGoal();
        // double testGetOrderTotal = cafeUtil.getOrderTotal();
        // System.out.println(getS);

        
        
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", cafeUtil.getOrderTotal(lineItems));

        
        System.out.println("----- Display Menu Test-----"); 
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        cafeUtil.displayMenu(menu);



    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            cafeUtil.addCustomer(customers);
            System.out.println("\n");
        }


        // System.out.println(testTheMethod);
        
    }

}