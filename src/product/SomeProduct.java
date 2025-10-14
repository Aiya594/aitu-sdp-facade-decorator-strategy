package product;

public class SomeProduct implements IProduct {

    private String productName;
    private double price;

    public SomeProduct(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return productName;
    }
}
