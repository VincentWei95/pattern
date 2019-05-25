package facade;

public class Stock1 implements StockInterface {
    @Override
    public void buy() {
       System.out.println("买入第一支股票");
    }

    @Override
    public void sale() {
        System.out.println("卖出第一支股票");
    }
}
