package singleton;

public class LazySingleton {
    private static LazySingleton sInstance;

    public static LazySingleton getInstance() {
        if (sInstance == null) {
            sInstance = new LazySingleton();
        }
        return sInstance;
    }
}
