package facade;

import visitor.IOrderVisitor;

public class Payment {
    public void processPayment(float sum) {
        System.out.println("Payment processed: " + sum+" tenge");
    }

    public void accept(IOrderVisitor visitor) {
        visitor.visitPayment(this);
    }
}
