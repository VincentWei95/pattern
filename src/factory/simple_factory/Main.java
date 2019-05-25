package factory.simple_factory;

/**
 * 简单工厂模式：
 * 定义：提供{@link SimpleOperationFactory}工厂类，传入对应参数返回对象（返回的对象是抽象类或接口），
 * 判断时根据类型创建具体类对象，实现多态
 *
 * 模式例子对象成员说明：
 * {@link Operation}:操作抽象类，方便在工厂返回对象实现多态
 * {@link Addition}:操作实现类，加法操作
 * {@link Subtraction}:操作实现类，减法操作
 * {@link Multiplication}:操作实现类，乘法操作
 * {@link Division}:操作实现类，除法操作
 *
 * {@link SimpleOperationFactory}:简单工厂类，返回操作对象
 */
public class Main {

    public static void main(String[] args) {
        Operation operation = SimpleOperationFactory.createOperation("+");
        operation.numberA = 1;
        operation.numberB = 2;
        System.out.println(operation.getResult());
    }
}
