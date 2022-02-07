public class CafeJava {
    public static void main(String[] args) {
        // declared String class variable???????? 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly. ";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $"; 

        // declared double class variable 
        double mochaPrice = 3.5;
        double dripCoffee = 2.25;
        double latte = 9.5;
        double cappaiccino = 4.99;

        // declared String class variable 
        String customer1 = "Cinddhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // declared boolen class variable 
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // print out
        if (isReadyOrder1 == true) {
            System.out.println(generalGreeting + customer1 + readyMessage + displayTotalMessage + dripCoffee);
            // Welcome to Cafe Java, Cinddhuri, your order will be ready shortly.Your total is $4.25
        } else {
            System.out.println(generalGreeting + customer1 + pendingMessage + displayTotalMessage + dripCoffee);
        }


        // if then =>
        if(!isReadyOrder2) {
            System.out.println(generalGreeting + customer2 + readyMessage + displayTotalMessage + cappaiccino);
        // else =>
        } else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
        }
            // Welcome to Cafe Java, Sam, your order is readyYour total is $4.99
            // Welcome to Cafe Java, Sam, your order will be ready shortly.

        // create a new variable to hold difference between price of drinks. 
        double newPrice = latte - dripCoffee;
        // Print out new price of drinks with variable I just created
        System.out.println(generalGreeting + customer3 + displayTotalMessage + newPrice);
             // Welcome to Cafe Java, JimmyYour total is $3.25
            // Welcome to Cafe Java, JimmyYour total is $7.25
    }
}