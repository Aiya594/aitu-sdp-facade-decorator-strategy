package deliveryStrategy;

public class DeliveryInfo {
    private final float price;
    private final int deliveryDays;
    private final String deliveryType;

    public DeliveryInfo(float price, int deliveryDate, String deliveryType) {
        this.price = price;
        this.deliveryDays = deliveryDate;
        this.deliveryType = deliveryType;
    }

    public float getPrice() {
        return price;
    }
    public int getDeliveryDays() {
        return deliveryDays;
    }
    public String getDeliveryType() {
        return deliveryType;
    }

    @Override
    public String toString() {
        return " Report for customer:" +
                "\ndelivery type: "+getDeliveryType()
                +"\ndelivery days: "+getDeliveryDays()
                +"\nprice: "+getPrice();
    }
}