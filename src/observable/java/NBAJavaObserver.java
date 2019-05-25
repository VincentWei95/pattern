package observable.java;

import java.util.Observable;
import java.util.Observer;

public class NBAJavaObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String msg = (String) arg;
        System.out.println(msg + "停止观看NBA继续工作!!!");
    }
}
