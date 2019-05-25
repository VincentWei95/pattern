package visitor;

/**
 * 访问者模式：
 * 定义：表示一个作用于某对象结构中的个元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作
 *
 * （简单理解：访问者模式就是在数据结构稳定基本不改动的算法下，将访问者visitor【例如Success和Failure】
 * 和操作者element【例如Male和Female】各自通过外部获取引用，解除两者之间的耦合，再由一个对象结构类bjectStructure关联二者）
 *
 * 访问者模式的优点：
 * 增加新的操作容易，因为增加新的操作意味着增加一个新的访问者。访问者模式将有关的行为集中到一个访问者对象中
 *
 * 访问者模式的不足：
 * 增加新的数据结构变得困难
 *
 * 使用场景：
 * 适用于数据结构相对稳定，有易于变化算法的系统（例如男人和女人两种性别，不会有其他性别）
 *
 * 在实际开发中，不改变数据结构算法的情况不多，所以访问者模式用得也不多
 *
 * 模式例子对象成员说明：
 * {@link Action}:visitor访问者接口，提供访问element接口，接口持有操作者element引用，男人和女人态度接口
 * {@link Success}:visitor访问者接口实现类，男人和女人成功的具体态度
 * {@link Failure}:visitor访问者接口实现类，男人和女人失败的具体态度
 *
 * {@link Person}:element操作者接口，提供操作visitor接口，接口持有访问者visitor引用，男人和女人处理方式接口
 * {@link Male}:element操作者接口，男人对某件事情的态度
 * {@link Female}:element操作者接口，女人对某件事的态度
 *
 * {@link ObjectStructure}:对象结构，关联visitor和element
 */
public class Main {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Male());
        objectStructure.attach(new Female());

        Action success = new Success();
        objectStructure.display(success);

        Action failure = new Failure();
        objectStructure.display(failure);
    }
}
