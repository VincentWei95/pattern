package strategy;

public class CashContext2 {
    private CashStrategy cashStrategy;

    public CashContext2(String type) {
        switch (type) {
            case "正常收费":
                cashStrategy = new CashNormal();
                break;
            case "满300返100":
                cashStrategy = new CashReturn(300, 100);
                break;
            case "打8折":
                cashStrategy = new CashRebate(0.8);
                break;
        }
    }

    public double getCashResult(double productMoney) {
        return cashStrategy.getCashResult(productMoney);
    }
}
