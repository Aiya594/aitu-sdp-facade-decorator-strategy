package deliveryStrategy.concrete;

import deliveryStrategy.DeliveryInfo;
import deliveryStrategy.IDeliveryStrategy;

public class PickupDelivery implements IDeliveryStrategy {
    @Override
    public DeliveryInfo calculateDelivery(float orderPrice) {
        float baseRate=0.0f;
        float sum=orderPrice + orderPrice*baseRate;
        int days=0;

        return new DeliveryInfo(sum,days,"PickUp Delivery");

    }
}
