import decorators.DiscountDecorator;
import decorators.TaxDecorator;
import facade.OrderFacade;
import product.IProduct;
import product.SomeProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IProduct orderWithTaxWithDiscount=new DiscountDecorator(new TaxDecorator(new SomeProduct("TV",130_990.0f)));
        OrderFacade order=new OrderFacade();
        order.completeOrder(orderWithTaxWithDiscount);

    }
}