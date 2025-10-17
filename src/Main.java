import decorators.DiscountDecorator;
import decorators.TaxDecorator;
import facade.Facade;
import product.IProduct;
import product.SomeProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IProduct tv=new SomeProduct("TV",130_990.0);

        IProduct withTax=new TaxDecorator(tv);
        IProduct withDiscount=new DiscountDecorator(withTax);

        Facade facade=new Facade();
        facade.completeOrder(withDiscount);




    }
}