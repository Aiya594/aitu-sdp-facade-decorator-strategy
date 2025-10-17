package decorators;

import product.IProduct;

 public abstract class Decorator implements IProduct {
    protected IProduct product;
    public Decorator(IProduct product) {
        this.product = product;
    }

    public float getPrice() {
        return product.getPrice();
    }
    public String getName() {
        return product.getName();
    }
}
