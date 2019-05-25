package strategy;

public class CashReturn implements CashStrategy {
    private double cashMoney;
    private double returnMoney;

    public CashReturn(double cashMoney, double returnMoney) {
        this.cashMoney = cashMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public double getCashResult(double productMoney) {
        // 购买满条件，减免现金
        if (productMoney >= cashMoney) {
            return productMoney - returnMoney;
        }
        return productMoney;
    }
}
