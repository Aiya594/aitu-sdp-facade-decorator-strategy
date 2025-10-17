package product;

public class SomeProduct implements IProduct {

    private final String productName;
    private final float price;

    public SomeProduct(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return productName;
    }
}
