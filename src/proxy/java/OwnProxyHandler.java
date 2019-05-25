package proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 自己访问自己的网页，可以修改内容，不能评分
 */
public class OwnProxyHandler implements InvocationHandler {
    private Person person;

    public OwnProxyHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 可以修改内容，不能评分，即setRating()不能调用
        if (method.getName().equals("setRating")) {
            throw new IllegalArgumentException("cannot rating!!!");
        }
        return method.invoke(person, args);
    }
}
