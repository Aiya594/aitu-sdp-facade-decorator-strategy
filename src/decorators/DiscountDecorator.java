package decorators;

import product.IProduct;
import visitor.IOrderVisitor;

public class DiscountDecorator extends Decorator {
    String discount="+discount(5%)";
    float discountPercentage =0.95f;

    public DiscountDecorator(IProduct product) {
        super(product);
    }

    public float getPrice() {
        return super.getPrice()* discountPercentage;
    }

    public String getName() {
        return super.getName()+discount;
    }

    @Override
    public void accept(IOrderVisitor visitor) {
        product.accept(visitor);
    }
}
