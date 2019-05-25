package bridge;

/**
 * 桥接模式：
 * 定义：将抽象部分与它的实现部分分离，使它们都可以独立地变化。使用了合成/聚合原则
 *
 * （简单理解：桥接模式就是以聚合的方式组合引用，达到解耦的目的，不会因为继承或接口的修改导致强耦合联动修改）
 *
 * 模式例子对象成员说明：
 * {@link Soft}:Implementor接口，被组合的对象接口，手机软件接口
 * {@link Game}:Implementor接口实现类，手机软件游戏
 * {@link Concat}:Implementor接口实现类，手机软件通讯录
 *
 * {@link Brand}:Abstraction抽象类，持有被组合的对象，手机品牌
 * {@link BrandM}:Abstraction实现类，手机品牌M
 * {@link BrandN}:Abstraction实现类，手机品牌N
 */
public class Main {

    public static void main(String[] args) {
        // 每个手机品牌都有自己独有的游戏和通讯录
        // 加个品牌只需要新建一个Brand类，加个软件只需要新建一个Soft类，符合合成/聚合原则，达到解耦的目的，也符合开闭原则

        // 手机品牌N的游戏和通讯录软件
        Brand brand = new BrandN();
        brand.setSoft(new Game());
        brand.run();
        brand.setSoft(new Concat());
        brand.run();

        // 手机品牌M的游戏和通讯录软件
        brand = new BrandM();
        brand.setSoft(new Game());
        brand.run();
        brand.setSoft(new Concat());
        brand.run();
    }
}
