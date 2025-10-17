package facade;

import product.IProduct;


public class OrderFacade {
    Payment payment=new Payment();
    NewOrder newOrder=new NewOrder();
    Message message=new Message();

    public void completeOrder(IProduct product){
        newOrder.createOrder(product.getName(),product.getPrice());

        message.sendConfirmation(product.getName());

        payment.processPayment(product.getPrice());

    }
}
