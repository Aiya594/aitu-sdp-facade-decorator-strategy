package decorators;

import product.IProduct;

public class TaxDecorator extends Decorator {
    String tax="+Tax(10%)";
    float taxPercentage=1.10f;

    public TaxDecorator(IProduct product) {
        super(product);
    }

    public float getPrice() {
        return super.getPrice() * taxPercentage;
    }

    public String getName() {
        return super.getName()+tax;
    }

}
