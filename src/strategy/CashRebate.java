package strategy;

public class CashRebate implements CashStrategy {
    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double getCashResult(double productMoney) {
        return productMoney * rebate;
    }
}
