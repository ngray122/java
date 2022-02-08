import java.util.ArrayList;
import java.util.stream.DoubleStream;

public class CafeUtil {

    // public static void testMethod(){
    // // System.out.println("Helllooooo thhhuuurrrrr");
    // }

    // public static String testMethod(){
    // return "WORKS";
    // }

    // method to return sum over 10 weeks
    public static int getStreakGoal(int numWeeks) {
        // variable to store sum
        int sumOverTenWeeks = 0;
        // incrementer
        int i = 1;
        // execute while i is less than or equal to 10
        while (i <= numWeeks) {
            // add sum to i as it increments
            sumOverTenWeeks += i;
            i++;
        }
        return sumOverTenWeeks;
    }

    // method to return total sum in array
    public double getOrderTotal(double[] prices) {
        // // variable to store sum in
    //     double total = 0;
    //     // loop through length of arr
    //     for (double value :dou prices) {
    //         // add each index value to sum
    //         total += value;
    //     }
    //     return total;
    // }

    double total = DoubleStream.of(prices).sum();
    return total;

    }

    // Method to print all items and indexes in ArrayList
    // NOT PRINTING IN THE SAME LINE
    public void displayMenu(ArrayList<String> menuItems) {
        // for loop
        for (int i = 0; i < menuItems.size(); i++) {
            // print each index
            // System.out.println(i);
            // // print each item
            // System.out.println(menuItems.get(i));
            System.out.println(String.format("%s %s", i , menuItems.get(i)));
        }
    }


    public void addCustomer(ArrayList<String>customers) {
        // Print to console
        System.out.println("Please enter your name: ");
        // copy and pasted from platform
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName);
        System.out.printf("There are people %s in front of you", customers.size());
        customers.add(userName);
        System.out.println(customers);

    }


}