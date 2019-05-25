package observable.delegate;

public class StockDelegateObserver {

    /**
     * 提供一个被通知更新的方法，因为是使用反射的方式实现通知
     * 注意方法参数要用具体对应类型，否则反射会失败
     */
    public void stopLookStock(String msg) {
        System.out.println(msg + "停止观看股票继续工作!!!");
    }
}
