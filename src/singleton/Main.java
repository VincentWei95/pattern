package singleton;

/**
 * 单例模式：
 * 定义：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 *
 * {@link HungerSingleton}:饿汉模式，类加载时就已经初始化完成不需要考虑线程同步问题，缺点是如果单例类从未使用，会造成内存浪费
 * {@link LazySingleton}:懒汉模式，线程不同步，不推荐使用
 * {@link DoubleLockSingleton}:双重锁模式，使用类锁解决线程同步问题，推荐使用
 * {@link InnerStaticSingleton}:内部类模式，类加载时只会初始化内部类，在getInstance()时才会加载单例类，
 * 达到懒加载的目的，也不需要考虑线程同步问题，推荐使用
 */
public class Main {
}
