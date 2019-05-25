package mediator;

/**
 * 中介者模式：
 * 定义：用一个中介对象来封装一系列的对象的交互。中介者使得各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互
 *
 * （简单理解：就是一个中介对象持有各个对象之间的引用，让对象与对象之间不紧耦合，对象之间的交互都有中介对象处理）
 *
 * 中介者模式的优点：
 * 1、Mediator中介者减少了各个Colleague对象的耦合，使得可以独立地改变和复用各个Colleague和Mediator
 * 2、由于把对象如何写作进行了抽象，将中介作为一个独立的概念并将其封装在一个对象中，这样关注的对象
 * 就从对象各自本身的行为转移到它们之间的交互上来，也就是站在一个更宏观的角度去看待系统
 *
 * 中介者模式的缺点：
 * Mediator控制了集中化，把交互复杂性变为中介者的复杂性，使得每个Mediator中介者都变得复杂
 *
 * 使用场景：
 * 1、一般应用于一组对象以定义良好但是复杂的方式进行通信的场合，比如计算器程序
 * 2、想定制一个分布在多个类中的行为，而又不想生成太多子类的场合
 *
 * 模式例子对象成员说明：
 * {@link UnitedNations}:Mediator中介者接口，提供Colleague之间通信的接口，联合国
 * {@link UnitedNationsSecurityCouncil}:Mediator中介者接口实现类，持有每个需要交互的Colleague，联合国理事会
 *
 * {@link Country}:Colleague抽象类，国家接口
 * {@link USA}:Colleague实现类，持有Mediator中介者引用，美国
 * {@link Iraq}:Colleague实现类，持有Mediator中介者引用，伊拉克
 */
public class Main {

    public static void main(String[] args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
        USA usa = new USA(UNSC);
        Iraq iraq = new Iraq(UNSC);

        UNSC.setUsa(usa);
        UNSC.setIraq(iraq);

        UNSC.declare("不准研制核武器，否则发动战争", iraq);
        UNSC.declare("我们没有核武器，也不怕侵略", usa);
    }
}
