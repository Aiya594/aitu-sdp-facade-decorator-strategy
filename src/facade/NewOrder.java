package facade;

public class NewOrder {
    public void createOrder(String product,double price){
        System.out.println("Order created: " + product+" "+price+"tenge");
    }
}
