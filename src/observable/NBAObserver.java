package observable;

public class NBAObserver implements Observer {
    @Override
    public void update(Object obj) {
        String msg = (String) obj;
        System.out.println(msg + "停止观看NBA继续工作!!!");
    }
}
