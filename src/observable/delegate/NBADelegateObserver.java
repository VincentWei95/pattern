package observable.delegate;

public class NBADelegateObserver {

    /**
     * 提供一个被通知更新的方法，因为是使用反射的方式实现通知
     * 注意方法参数要用具体对应类型，否则反射会失败
     */
    public void stopLookNBA(String msg) {
        System.out.println(msg + "停止观看NBA继续工作!!!");
    }
}
