package observable;

import observable.delegate.*;
import observable.java.BossJavaObservable;
import observable.java.NBAJavaObserver;
import observable.java.ReceptionJavaObservable;
import observable.java.StockJavaObserver;

/**
 * 观察者模式：
 * 定义：定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主体对象。
 * 这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 *
 * 使用场景：
 * 当一个对象的改变需要同时改变其他对象，且它不知道具体有多少个对象有待改变的时候
 *
 * 观察者模式的不足：
 * 虽然观察者Observable和被观察者Observer是接口，实现类之间各自依赖抽象接口，符合依赖倒转原则，
 * 但是抽象接口之间还是有耦合联系，比如Observer接口丢失，Observable就无法通知
 *
 * 解决观察者模式的不足：
 * 使用委托的方式，具体查看{@link observable.delegate}包
 *
 * 模式例子对象成员说明：
 * 1、自定义观察者模式
 * {@link Observable}:观察者Observable接口，提供注册、解注册、通知接口
 * {@link BossObservable}:观察者接口实现类，老板观察者
 * {@link ReceptionObservable}:观察者实现类，前台观察者
 *
 * {@link Observer}:被观察者Observer接口，提供更新接口
 * {@link NBAObserver}:被观察者接口实现类，观看NBA的同事
 * {@link StockObserver}:被观察者接口实现类，观看股票的同事
 *
 * 2、java提供的观察者模式（弊端：Observable是抽象类不是接口，违反面向接口编程原则）
 * {@link BossJavaObservable}:老板观察者
 * {@link ReceptionJavaObservable}:前台观察者
 *
 * {@link NBAJavaObserver}:观看NBA的同事
 * {@link StockJavaObserver}:观看股票的同事
 *
 * 3、委托实现观察者模式（解除了传统观察者Observable和Observer接口之间的耦合，达到完全解耦）
 * {@link Event}:通知的事件，被观察者对象的封装类
 * {@link EventHandler}:观察者Observable委托通知被观察者Observer管理类
 *
 * {@link observable.delegate.Observable}:观察者抽象类，持有EventHandler引用通知Observer
 * {@link BossDelegateObservable}:观察者具体实现类，老板观察者
 * {@link ReceptionDelegateObservable}:观察者具体实现类，前台观察者
 *
 * {@link NBADelegateObserver}:被观察者类，观看NBA的同事
 * {@link StockDelegateObserver}:被观察者，观看股票的同事
 */
public class Main {

    public static void main(String[] args) {
        Observable receptionObservable = new ReceptionObservable();
        Observer nbaObserver = new NBAObserver();
        Observer stockObserver = new StockObserver();
        receptionObservable.register(nbaObserver);
        receptionObservable.register(stockObserver);
        // 看股票的同事没有通知到
        receptionObservable.unregister(stockObserver);
        receptionObservable.notifyChanged("自定义观察者通知老板回来了!!!");
        // 老板警告看股票同事
        Observable bossObservable = new BossObservable();
        bossObservable.register(stockObserver);
        bossObservable.notifyChanged("自定义观者者通知以后注意!!!");

        //java提供的观察者模式
        ReceptionJavaObservable receptionJavaObservable = new ReceptionJavaObservable();
        java.util.Observer nbaJavaObserver = new NBAJavaObserver();
        java.util.Observer stockJavaObserver = new StockJavaObserver();
        receptionJavaObservable.addObserver(nbaJavaObserver);
        receptionJavaObservable.addObserver(stockJavaObserver);
        // 看股票的同事没有通知到
        receptionJavaObservable.deleteObserver(stockJavaObserver);
        receptionJavaObservable.notifyChanged("java观察者通知老板回来了!!!");
        // 老板警告看股票同事
        BossJavaObservable bossJavaObservable = new BossJavaObservable();
        bossJavaObservable.addObserver(stockJavaObserver);
        bossJavaObservable.notifyChanged("java观察者通知以后注意!!!");

        // 使用委托的方式实现观察者模式
        ReceptionDelegateObservable receptionDelegateObservable = new ReceptionDelegateObservable();
        NBADelegateObserver nbaDelegateObserver = new NBADelegateObserver();
        StockDelegateObserver stockDelegateObserver = new StockDelegateObserver();
        receptionDelegateObservable.addEvent(nbaDelegateObserver, "stopLookNBA", "委托观察者通知老板回来了!!!");
        receptionDelegateObservable.addEvent(stockDelegateObserver, "stopLookStock", "委托观察者通知老板回来了!!!");
        // 看股票的同事没有通知到
        receptionDelegateObservable.removeEvent(stockDelegateObserver);
        receptionDelegateObservable.notifyChanged();
        // 老板警告看股票同事
        BossDelegateObservable bossDelegateObservable = new BossDelegateObservable();
        bossDelegateObservable.addEvent(stockDelegateObserver, "stopLookStock", "委托观察者通知以后注意!!!");
        bossDelegateObservable.notifyChanged();
    }
}
