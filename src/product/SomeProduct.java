package product;

import observe.IObserver;
import observe.ISubject;
import visitor.IOrderVisitor;

import java.util.ArrayList;
import java.util.List;

public class SomeProduct implements IProduct, ISubject {

    private final String productName;
    private float price;
    private final List<IObserver> observers = new ArrayList<>();

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


    public void accept(IOrderVisitor visitor) {
        visitor.visitProduct(this);
    }


    public void setPrice(float newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            System.out.println("Price updated for " + productName + ": " + newPrice + " tenge");
            notifyObservers(productName, newPrice);
        }
    }

    @Override
    public void subscribe(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String productName, float price) {
        for (IObserver obs : observers) {
            obs.update(productName, price);
        }
    }
}
