import decorators.DiscountDecorator;
import decorators.TaxDecorator;
import deliveryStrategy.IDeliveryStrategy;
import deliveryStrategy.concrete.ExpressDelivery;
import deliveryStrategy.concrete.PickupDelivery;
import facade.OrderFacade;
import observe.User;
import product.IProduct;
import product.SomeProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    IDeliveryStrategy express=new ExpressDelivery();

    public static void main(String[] args) {
        SomeProduct phone = new SomeProduct("Smartphone", 150000f);
        SomeProduct tv = new SomeProduct("TV", 130990f);


        User aizada = new User("Aizada");
        User nastya= new User("Nastya");

        System.out.println("2 observers subscribed for phone:");
        phone.addObserver(aizada);
        phone.addObserver(nastya);

        System.out.println("\nChange the price and notify observers:");
        phone.setPrice(135000f);
        phone.setPrice(120000f);

        phone.removeObserver(aizada);

        System.out.println("\nChange the price and notify observers:");
        phone.setPrice(100000f);

        System.out.println("\nOrder:");
        IProduct product =new DiscountDecorator(
                new TaxDecorator(phone)
        );

        OrderFacade order=new OrderFacade();
        order.completeOrder(product, new ExpressDelivery());

    }
}