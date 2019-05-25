package singleton;

public class HungerSingleton {
    private static HungerSingleton sInstance = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return sInstance;
    }
}
