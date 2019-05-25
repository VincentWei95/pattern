package command;

/**
 * 命令模式：
 * 定义：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；
 * 对请求排队或记录请求日志，以及支持可撤销的操作
 *
 * 命令模式的好处：
 * 1、能较容易地设计一个命令队列
 * 2、在需要的情况下可以较容易地将命令计入日志（由Waitress服务员处理，也就是invoker通知动作执行者）
 * 2、允许接收请求的一方决定是否要否决请求（Waitress要点羊肉串，告诉客户没有）
 * 4、可以容易地实现对请求的撤销和重做（Waitress.cancelOrder(Command)）
 * 5、由于加进新的具体命令类不影响其他的类，因此增加新的命令类很容易（即新增Command命令，在Waitress有维护一个命令列表控制命令执行）
 * 6、把请求一个操作的对象与知道怎么执行一个操作的对象分割开（Client为请求操作的对象，Barbecuer执行操作的对象）
 *
 * 模式例子对象成员说明：
 * {@link Command}:动作操作接口，提供一个执行操作的接口，提供一个烤肉的动作
 * {@link BakeMuttonCommand}:动作操作接口实现类，持有执行Command动作的引用Barbecuer，烤羊肉动作
 * {@link BakeChickenCommand}:动作操作接口实现类，持有执行Command动作的引用Barbecuer，烤鸡翅动作
 *
 * {@link Barbecuer}:动作Command执行者，烤肉厨师
 * {@link Waitress}:通知动作执行者，服务员
 */
public class Main {

    public static void main(String[] args) {
        // 烤肉店开店前准备
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        Command bakeChickenCommand = new BakeChickenCommand(barbecuer);
        Waitress waitress = new Waitress();

        // 顾客点菜
        waitress.setOrder(bakeMuttonCommand);
        waitress.setOrder(bakeChickenCommand);

        // 点菜完毕，通知厨房
        waitress.notifyBarbecue();
    }
}
