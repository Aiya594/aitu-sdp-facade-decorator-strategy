package deliveryStrategy.concrete;

import deliveryStrategy.DeliveryInfo;
import deliveryStrategy.IDeliveryStrategy;

public class ExpressDelivery implements IDeliveryStrategy {
    @Override
    public DeliveryInfo calculateDelivery(float orderPrice) {
        float baseRate=0.1f;
        float sum=orderPrice + orderPrice*baseRate;
        int days=3;

        return new DeliveryInfo(sum,days,"Express Delivery");
    }
}
