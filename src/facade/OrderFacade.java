package facade;

import deliveryStrategy.DeliveryService;
import deliveryStrategy.IDeliveryStrategy;
import product.IProduct;
import visitor.AnalyticsVisitor;
import visitor.IOrderVisitor;


public class OrderFacade {

    Payment payment=new Payment();
    NewOrder newOrder=new NewOrder();
    Message message=new Message();
    DeliveryService deliveryService=new DeliveryService();
    IOrderVisitor analyticsVisitor=new AnalyticsVisitor();

    public void completeOrder(IProduct product, IDeliveryStrategy delivery){

        newOrder.createOrder(product.getName(),product.getPrice());

        product.accept(analyticsVisitor);

        message.sendConfirmation(product.getName());
        payment.processPayment(product.getPrice());

        payment.accept(analyticsVisitor);

        deliveryService.setStrategy(delivery);
        System.out.println( deliveryService.calculateDelivery(product.getPrice()).toString());

        ((AnalyticsVisitor) analyticsVisitor).printReport();
    }

}
