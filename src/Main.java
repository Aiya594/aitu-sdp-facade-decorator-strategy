import decorators.DiscountDecorator;
import decorators.TaxDecorator;
import deliveryStrategy.concrete.ExpressDelivery;
import facade.OrderFacade;
import product.IProduct;
import product.SomeProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IProduct product =new DiscountDecorator(
                new TaxDecorator(new SomeProduct("TV",130_990f))
        );

        OrderFacade order=new OrderFacade();
        order.completeOrder(product, new ExpressDelivery());
    }
}