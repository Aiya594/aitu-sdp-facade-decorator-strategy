package decorators;

import product.IProduct;

public class DiscountDecorator extends Decorator {
    public DiscountDecorator(IProduct product) {
        super(product);
    }

    public double getPrice() {
        return super.getPrice()*0.95;
    }


    public String getName() {
        return super.getName()+"+discount(5%)";
    }
}
