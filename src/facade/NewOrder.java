package facade;

public class NewOrder {
    public void createOrder(String product,float price){
        System.out.println("Order created: " + product+" "+price+"tenge");
    }
}
