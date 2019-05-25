package singleton;

public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton sInstance;

    public static DoubleLockSingleton getInstance() {
        if (sInstance == null) {
            // 拿的是类锁，在这个类访问getInstance()未拿到锁的都会同步阻塞
            synchronized (DoubleLockSingleton.class) {
                if (sInstance == null) {
                    sInstance = new DoubleLockSingleton();
                }
            }
        }
        return sInstance;
    }
}
