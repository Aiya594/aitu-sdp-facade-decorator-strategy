package product;

import visitor.IOrderVisitor;

public interface IProduct {
    float getPrice();
    String getName();
    void accept(IOrderVisitor visitor);
}
