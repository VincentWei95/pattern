package facade;

public class Stock2 implements StockInterface {
    @Override
    public void buy() {
       System.out.println("买入第二支股票");
    }

    @Override
    public void sale() {
        System.out.println("卖出第二支股票");
    }
}
