package proxy.java;

import java.lang.reflect.Proxy;

/**
 * 代理管理类
 */
public class ProxyHandler {
    private Person person;

    public ProxyHandler(Person person) {
        this.person = person;
    }

    /**
     * 这里要提供接口类，否则会有ClassCastException
     */
    public Person getOwnProxyHandler() {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new OwnProxyHandler(person));
    }

    /**
     * 这里要提供接口类，否则会有ClassCastException
     */
    public Person getNonOwnProxyHandler() {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new NonOwnProxyHandler(person));
    }
}
