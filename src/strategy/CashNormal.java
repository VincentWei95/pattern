package strategy;

public class CashNormal implements CashStrategy {
    @Override
    public double getCashResult(double productMoney) {
        return productMoney;
    }
}
