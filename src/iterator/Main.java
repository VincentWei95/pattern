package iterator;

/**
 * 迭代器模式：
 * 定义：提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示
 *
 * （简单理解：就是提供一系列处理集合或数组对象的接口，如add()、remove()、for-each等）
 *
 * 其实现在的集合数组都有for-each循环，编程语言已经具备这个功能，这个模式基本用处不大
 *
 * 使用场景：
 * 1、需要访问一个聚集对象，而且不管这些对象是什么都需要遍历的时候，应该考虑使用迭代器模式
 * 2、需要对聚集对象有多种方式遍历时，应该考虑使用迭代器模式
 *
 * 模式例子对象成员说明：
 * {@link Menu}:聚集对象接口，提供创建迭代器接口，菜单接口
 * {@link DinerMenu}:聚集对象接口实现类，用数组存储菜式的菜单，晚饭菜单
 * {@link PancakeMenu}:聚集对象接口实现类，用集合存储菜式的菜单，午饭菜单
 * {@link MenuItem}:菜单菜式对象类
 *
 * {@link Iterator}:迭代器接口，提供操作聚集对象的一系列接口
 * {@link DinerMenuIterator}:迭代器接口实现类，晚饭菜单迭代器
 * {@link PancakeMenuIterator}:迭代器接口实现类，午饭菜单迭代器
 *
 * {@link Waitress}:服务员
 *
 */
public class Main {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeMenu pancakeMenu = new PancakeMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeMenu);
        waitress.printMenu();
    }
}
