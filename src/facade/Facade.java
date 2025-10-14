package facade;

import product.IProduct;

import static facade.Subsystems.*;

public class Facade {

    public void completeOrder(IProduct product){
        createOrder(product.getName(),product.getPrice());

        sendConfirmation(product.getName());

        processPayment(product.getPrice());

    }
}
