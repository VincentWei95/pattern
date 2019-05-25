package proxy;

/**
 * 代理模式：
 * 定义：为其他对象提供一种代理以控制对这个对象的访问。
 *
 * 使用场景：
 * 1、远程代理：也就是为一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实。
 * 2、虚拟代理：是根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象。
 * 3、安全代理：控制真实对象访问时的权限。
 * 4、智能指引：当调用真实的对象时，代理处理另外一些事。
 * 总结：以上使用代理模式的场景，都是在访问对象时引入一定程度的间接性，因为这种间接性，可以附加多种用途
 *
 * 模式例子对象成员说明：
 * {@link MeiMei}:客户端接收对象，接收小王礼物的MeiMei，MeiMei认识小明
 *
 * {@link GiveGift}:代理接口，实际对象和代理对象都要实现的接口，小王和小明都要实现
 * {@link XiaoWang}:实际发送对象，代理接口实现类，想送MeiMei礼物的小王，但MeiMei不认识小王，小王是小明朋友
 * {@link XiaoMing}:代理发送对象，代理接口实现类，代理小王送礼物给MeiMei
 */
public class Main {

    public static void main(String[] args) {
        MeiMei meiMei = new MeiMei("MeiMei");
        XiaoMing xiaoMing = new XiaoMing(meiMei);
        xiaoMing.giveFlower();
        xiaoMing.giveDolls();
        xiaoMing.giveChocolate();
    }
}
