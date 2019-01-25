package designpatterns.exercises.singleton;

public class ShopImplementation {
    public static void main(String[] args) {
        OnlineShopEngine engine = new OnlineShopEngine();

        User testUser1 = engine.registerUser("Ivonne");
        engine.signGdpr(testUser1);
        engine.makeOrder(testUser1);

        User testUser2 = engine.registerUser("Hans");
        // Forgot to sign GDPR
        engine.makeOrder(testUser2);
    }
}
