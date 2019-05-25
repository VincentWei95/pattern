package decorate;

/**
 * 被装饰的对象
 */
public class Person implements Human {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(name + "今天的穿着");
    }
}
