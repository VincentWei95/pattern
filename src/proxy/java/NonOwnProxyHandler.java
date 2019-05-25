package proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 别人访问自己的网页，除了评分，其他内容不能修改
 */
public class NonOwnProxyHandler implements InvocationHandler {
    private Person person;

    public NonOwnProxyHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 除了评分，其他内容不能修改，即除了setRating()和getter，都不能修改
        String methodName = method.getName();
        if (methodName.startsWith("set") && !methodName.equals("setRating")) {
            throw new IllegalArgumentException("cannot setter except setRating!!!");
        }
        return method.invoke(person, args);
    }
}
