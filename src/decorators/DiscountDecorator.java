package decorators;

import product.IProduct;

public class DiscountDecorator extends Decorator {
    public DiscountDecorator(IProduct product) {
        super(product);
    }

    public double getPrice() {
        return product.getPrice()*0.95;
    }

    @Override
    public String getName() {
        return product.getName()+"+discount(5%)";
    }
}
