package deliveryStrategy.concrete;

import deliveryStrategy.DeliveryInfo;
import deliveryStrategy.IDeliveryStrategy;

public class StandardDelivery implements IDeliveryStrategy {
    @Override
    public DeliveryInfo calculateDelivery(float orderPrice) {
        float baseRate=0.05f;
        float sum=orderPrice + orderPrice*baseRate;
        int days=7;

        return new DeliveryInfo(sum,days,"Standard Delivery");

    }
}
