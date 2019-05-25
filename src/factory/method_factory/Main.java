package factory.method_factory;

import factory.method_factory.addition.AdditionFactory;

/**
 * 工厂方法模式：
 * 定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到子类
 *
 * （工厂方法接口{@link OperationFactory#createOperation()}提供子类工厂创建对应的对象）
 *
 * 简单工厂模式与工厂方法模式的区别：
 * 1、简单工厂只有一个工厂类{@link factory.simple_factory.SimpleOperationFactory}，
 * 有新的业务改动时需要修改工厂类在switch添加新业务对象，违反开闭原则
 * 2、工厂方法模式只需要新增新的工厂子类，修改创建具体工厂的那一句代码即可
 *
 * 模式例子对象成员说明：
 * {@link Operation}:操作抽象类，方便在工厂返回对象实现多态
 * {@link factory.method_factory.addition.Addition}:操作实现类，加法操作
 * {@link factory.method_factory.subtraction.Subtraction}:操作实现类，减法操作
 * {@link factory.method_factory.multiplication.Multiplication}:操作实现类，乘法操作
 * {@link factory.method_factory.division.Division}:操作实现类，除法操作
 *
 * {@link OperationFactory}:创建工厂接口，提供返回工厂对象的接口
 * {@link factory.method_factory.addition.AdditionFactory}:创建工厂实现类，加法操作工厂
 * {@link factory.method_factory.subtraction.SubtractionFactory}:创建工厂实现类，减法操作工厂
 * {@link factory.method_factory.multiplication.MultiplicationFactory}:创建工厂实现类，乘法操作工厂
 * {@link factory.method_factory.division.DivisionFactory}:创建工厂实现类，除法操作工厂
 */
public class Main {

    public static void main(String[] args) {
        // 使用工厂方法模式的好处是，如果修改业务，只需要修改创建工厂返回的对象new AdditionFactory即可
        OperationFactory factory = new AdditionFactory();
        Operation operation = factory.createOperation();
        operation.numberA = 1;
        operation.numberB = 2;
        System.out.println(operation.getResult());
    }
}
