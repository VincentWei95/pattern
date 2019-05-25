package prototype;

/**
 * 原型模式：
 * 定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * （简单理解：原型模式就是以第一个创建的对象作为副本，提供一个接口返回当前副本对象，
 * 相同的对象要改某个字段，只需要拿这个副本去修改就行）
 *
 * 浅复制：通过接口返回的副本对象，只会拷贝副本对象的基本类型变量，不会拷贝副本对象的数组和对象变量（副本对象要实现Cloneable接口）
 * 深复制：通过接口返回的副本对象，会拷贝副本对象所有基本类型变量和数组以及对象变量（副本对象和对象变量需要实现Cloneable接口）
 *
 * java提供了Object.clone()用来返回副本对象，调用Object.clone()前必须要实现标记接口Cloneable，否则抛出CloneNotSupportException
 *
 * 模式例子对象成员说明：
 * {@link Person}:群众类对象，一个人，因为会被复制，所以需要实现Cloneable和重写clone()方法
 * {@link Address}:地址类对象，地址，如果需要深复制，需要实现Cloneable和重写clone()方法
 */
public class Main {

    public static void main(String[] args) {
//        Person xiaowang = new Person("小王", 20);
//        Person xiaoming = xiaowang;   // 这样是达不到对象复制的目的，而是xiaoming指向xiaowang的引用，导致修改了xiaoming，xiaowang也同样会被修改
//        xiaoming.setName("小明");
//        System.out.println(xiaowang.toString());
//        System.out.println(xiaoming.toString());

        // clone方法内部是底层方法native clone()，会为对象开辟独立的内存空间，相比new对象要快而且是拷贝对象
        Person xiaowang = new Person("小王", 20);
        Address address = new Address("深圳市南山区");
        xiaowang.setAddress(address);
        System.out.println(xiaowang.toString());

        Person xiaoming = xiaowang.clone();
        xiaoming.setName("小明");
        System.out.println(xiaoming.toString());

        // 如果没有深复制（即Address实现Cloneable重写clone()），会出现改了xiaowang的Address，xiaoming的Address也同步改变输出"深圳是龙岗区"
        // 因为clone()是为对象独立开辟内存空间的，所以改了xiaowang的Address，是不可能会修改到xiaoming的Address
        // 对象中含有对象的情况（即Person中有Address对象），浅复制拷贝的只是Address的引用，这就导致xiaowang的Address和xiaoming的Address指向同一个内存引用导致错误
        // 解决办法是Address实现Cloneable方法并重写clone()，Person的clone()同样要修改下将Address变量获取为Address的clone()
        address.setAddress("深圳市龙岗区");
        System.out.println(xiaowang.toString());
        System.out.println(xiaoming.toString());
    }
}
