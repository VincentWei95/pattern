package adapter;

/**
 * 适配器模式：
 * 定义：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 *
 * （简单理解：就是提供了一个接口，各自实现这个接口，达到兼容的目的）
 *
 * 使用场景：
 * 1、系统的数据和行为都正确，但接口不符时，就应该考虑用适配器，目的是使控制范围之外的一个原有对象与某个接口匹配
 * （就是两个类所做的事情相同或相似，但是具有不同的接口的时候使用适配器模式）
 * 2、双方的代码都不容易修改
 * 3、兼容第三方组件
 *
 * 模式例子对象成员说明：
 * {@link Player}:客户端接口，球员接口
 * {@link AmericaForwardPlayer}:客户端接口实现类，前锋球员
 * {@link AmericaGuardPlayer}:客户端接口实现类，后卫球员
 *
 * {@link PlayerAdapter}:适配器接口，需要实现{@link Player}接口
 * {@link Translator}:适配器接口实现类，内部持有被适配的类引用，翻译员
 * {@link ChineseCenterForwardPlayer}:适配器接口实现类，中国外籍中锋
 */
public class Main {

    public static void main(String[] args) {
        Player forwardPlayer = new AmericaForwardPlayer();
        Player guardPlayer = new AmericaGuardPlayer();
        forwardPlayer.attack();
        guardPlayer.defense();

        Translator translator = new Translator();
        translator.defense();
    }
}
