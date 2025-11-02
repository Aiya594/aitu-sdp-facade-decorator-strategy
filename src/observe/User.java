package observe;

public class User implements IObserver{
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName, float price) {
        System.out.println("User " + name + " notified: " + productName + " price changed to " + price + " tenge");
    }
}
