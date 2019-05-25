package decorate;

/**
 * 装饰模式：
 * 定义：动态地给一个对象添加额外的职责。在增加功能来说，装饰模式比生成子类更为灵活。
 *
 * 模式例子对象成员说明：
 * {@link Human}:被装饰对象的接口，具体被装饰对象和装饰接口都要实现该接口（装饰接口要实现是因为需要封装被装饰对象）
 * {@link Person}:具体被装饰对象，实现了Human接口
 *
 * {@link Decorate}:装饰接口，具体装饰类都要实现该接口
 * {@link ClothesDecorate}:装饰接口实现类，衣服装饰
 * {@link UnderPantsDecorate}:装饰接口实现类，内裤装饰
 * {@link TrousersDecorate}:装饰接口实现类，裤子装饰
 */
public class Main {

    public static void main(String[] args) {
        Human human = new Person("小明");
        Decorate clothesDecorate = new ClothesDecorate(human);
        Decorate underPantsDecorate = new UnderPantsDecorate(clothesDecorate);
        Decorate trousersDecorate = new TrousersDecorate(underPantsDecorate);
        trousersDecorate.show();
    }
}
