package observable;

public class StockObserver implements Observer {
    @Override
    public void update(Object obj) {
        String msg = (String) obj;
        System.out.println(msg + "停止观看股票继续工作!!!");
    }
}
