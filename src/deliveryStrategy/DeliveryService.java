package deliveryStrategy;

import deliveryStrategy.concrete.StandardDelivery;

public class DeliveryService {
    private IDeliveryStrategy strategy;

    public void setStrategy(IDeliveryStrategy strategy) {
        this.strategy = strategy;
    }
    public DeliveryInfo calculateDelivery(float orderPrice) {
        if (strategy == null) {
            setStrategy(new StandardDelivery()); //maybe will be fixed
        }
        return strategy.calculateDelivery(orderPrice);
    }
}
