public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly. ";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $"; 

        double mochaPrice = 3.5;
        double dripCoffee = 2.25;
        double latte = 9.5;
        double cappaiccino = 4.99;

        String customer1 = "Cinddhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;


        System.out.println(generalGreeting + customer1 + pendingMessage + displayTotalMessage + dripCoffee);
        // Welcome to Cafe Java, Cinddhuri, your order will be ready shortly.Your total is $4.25


        if(isReadyOrder2) {
            System.out.println(generalGreeting + customer2 + readyMessage + displayTotalMessage + cappaiccino);
        } else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
        }
        // Welcome to Cafe Java, Sam, your order is readyYour total is $4.99
        // Welcome to Cafe Java, Sam, your order will be ready shortly.

     
        double newPrice = latte - dripCoffee;
        System.out.println(generalGreeting + customer3 + displayTotalMessage + newPrice);
        // Welcome to Cafe Java, JimmyYour total is $3.25
        // Welcome to Cafe Java, JimmyYour total is $7.25
        
        


    }
}