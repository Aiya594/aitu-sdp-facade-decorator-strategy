package visitor;

import decorators.Decorator;
import deliveryStrategy.DeliveryInfo;
import facade.Payment;
import product.IProduct;

public class AnalyticsVisitor implements IOrderVisitor{
    private float totalPrice = 0;
    private int orderCount = 0;

    @Override
    public void visitProduct(IProduct product) {
        totalPrice += product.getPrice();
        orderCount++;
    }

    @Override
    public void visitPayment(Payment payment) {
        System.out.println("Payment recorded in analytics");
    }


    public void printReport(){
        System.out.printf("""
                REPORT for store:
                Orders processed: %d
                Total revenue: %.1f tenge
                
                """,orderCount,totalPrice);
    }

}
