package decorators;

import product.IProduct;

public class TaxDecorator extends Decorator {

    public TaxDecorator(IProduct product) {
        super(product);
    }

    public double getPrice() {
        return super.getPrice() * 1.10;
    }

    public String getName() {
        return super.getName()+"+Tax(10%)";
    }

}
