package visitor;

import facade.Payment;
import product.IProduct;

//order visitor to collect metrics for store
public interface IOrderVisitor {
    void visitProduct(IProduct product);
    void visitPayment(Payment payment);
}
