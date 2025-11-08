import decorators.DiscountDecorator;
import decorators.TaxDecorator;
import deliveryStrategy.IDeliveryStrategy;
import deliveryStrategy.concrete.ExpressDelivery;
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

        System.out.printf("2 observers subscribed for %s:\n",phone.getName());
        phone.subscribe(aizada);
        phone.subscribe(nastya);

        System.out.println("\nChange the price and notify observers:");
        phone.setPrice(135000f);
        phone.setPrice(120000f);

        //nastya subcribes for tv
        tv.subscribe(nastya);

        phone.unsubscribe(aizada);

        System.out.println("\nChange the price and notify observers:");
        phone.setPrice(100000f);
        tv.setPrice(50000f);

        System.out.println("\nOrder:");
        IProduct product =new DiscountDecorator(
                new TaxDecorator(phone)
        );

        OrderFacade order=new OrderFacade();
        order.completeOrder(product, new ExpressDelivery());

    }
}