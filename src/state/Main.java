package state;

/**
 * 状态模式：
 * 定义：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
 *
 * （简单理解：就是把每一种状态都用一个类来表示，能有效减少if-else或switch运行时判断）
 *
 * 使用场景：
 * 1、当控制一个对象状态转换的条件表达式过于复杂时，把状态的判断逻辑转移到表示不同状态的一系列类当中
 * 2、当一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为时
 * 3、需要大量if-else或switch判断状态或枚举
 *
 * 模式例子对象成员说明：
 * {@link Work}:持有状态对象的引用，工作对象
 *
 * {@link WorkState}:状态接口
 * {@link MorningWorkState}:状态接口实现类，上午工作状态
 * {@link NoonWorkState}:状态接口实现类，中午工作状态
 * {@link AfternoonWorkState}:状态接口实现类，下午工作状态
 * {@link EveningWorkState}:状态接口实现类，傍晚工作状态
 * {@link GoOffWorkState}:状态接口实现类，下班状态
 * {@link SleepWorkState}:状态接口实现类，睡觉状态
 */
public class Main {

    public static void main(String[] args) {
        Work work = new Work();
        work.setWorkHour(9);
        work.writeProgram();

        work.setWorkHour(10);
        work.writeProgram();

        work.setWorkHour(12);
        work.writeProgram();

        work.setWorkHour(13);
        work.writeProgram();

        work.setWorkHour(14);
        work.writeProgram();

        work.setWorkHour(17);
        work.writeProgram();

//        work.setWorkFinished(true);
//        work.writeProgram();

        work.setWorkHour(19);
        work.writeProgram();

        work.setWorkHour(22);
        work.writeProgram();
    }
}
