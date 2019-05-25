package command;

import java.util.ArrayList;
import java.util.List;

public class Waitress {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        // 客户提出请求时，没货的烧烤进行回绝
        if (command.getClass().getSimpleName().equals(BakeMuttonCommand.class.getSimpleName())) {
            System.out.println("没有羊肉了");
        } else {
            orders.add(command);
            // 打印相当于记录日志
            System.out.println("添加订单:" + command.getClass().getSimpleName());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        // 打印相当于记录日志
        System.out.println("取消订单:" + command.getClass().getSimpleName());
    }

    public void notifyBarbecue() {
        for (Command command : orders) {
            command.execCommand();
        }
    }
}
