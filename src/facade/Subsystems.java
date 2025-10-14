package facade;

public class Subsystems {
    public static void createOrder(String product,double price){
        System.out.println("Order created: " + product+" "+price+"tenge");
    }

    public static void sendConfirmation(String product) {
        System.out.println("Confirmation message sent for: " + product);
    }

    public static void processPayment(double sum) {
        System.out.println("Payment processed: " + sum+" tenge");
    }


}
