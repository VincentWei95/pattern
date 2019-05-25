package strategy;

/**
 * 策略模式：
 * 提供策略接口{@link CashStrategy}，子类具体实现接口对应的行为，由执行类{@link CashContext}或{@link CashContext2}维护策略引用。
 * 策略模式能有效减少if-else和switch语句，提高扩展性
 * （听到业务需求要在不同时间使用不同业务，就要考虑到策略模式）
 *
 * 模式例子对象成员说明：
 * {@link CashStrategy}:策略接口，策略行为都要实现的接口
 * {@link CashNormal}:策略接口实现类，商品正常价格
 * {@link CashRebate}:策略接口实现类，商品打折
 * {@link CashReturn}:策略接口实现类，商品满返
 *
 * {@link CashContext}:策略引用维护类，即策略执行类
 * {@link CashContext2}:策略引用维护类，即策略执行类，与简单工厂模式配合的策略模式
 */
public class Main {

    public static void main(String[] args) {
        // ①虽然实现了策略模式，但暴露了逻辑实现
//        CashContext cashContext = null;
//        String type = "满300返100";
//        double productMoney = 300;
//        switch (type) {
//            case "正常收费":
//                cashContext = new CashContext(new CashNormal());
//                break;
//            case "满300返100":
//                cashContext = new CashContext(new CashReturn(300, 100));
//                break;
//            case "打8折":
//                cashContext = new CashContext(new CashRebate(0.8));
//                break;
//        }
//        double totalPrice = cashContext.getCashResult(productMoney);
//        System.out.println(totalPrice);

        //②结合简单工厂实现策略
        String type = "满300返100";
        double productMoney = 300;
        CashContext2 cashContext2 = new CashContext2(type);
        double totalPrice = cashContext2.getCashResult(productMoney);
        System.out.println(totalPrice);
    }
}
