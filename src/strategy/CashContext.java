package strategy;

public class CashContext {
    private CashStrategy cashStrategy;

    public CashContext(CashStrategy cashStrategy) {
        this.cashStrategy = cashStrategy;
    }

    public double getCashResult(double productMoney) {
        return cashStrategy.getCashResult(productMoney);
    }
}
