package singleton;

public class InnerStaticSingleton {

    private static class SingletonHelper {
        private static final InnerStaticSingleton sInstance = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return SingletonHelper.sInstance;
    }
}
