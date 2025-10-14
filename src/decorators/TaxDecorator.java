package decorators;

import product.IProduct;

public class TaxDecorator extends Decorator {

    public TaxDecorator(IProduct product) {
        super(product);
    }

    public double getPrice() {
        return product.getPrice() * 1.10;
    }

    public String getName() {
        return product.getName()+"+Tax(10%)";
    }

}
