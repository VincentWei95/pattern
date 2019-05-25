package observable.delegate;

import java.lang.reflect.Method;

public class Event {
    /**
     * 执行方法的对象
     */
    private Object observer;
    /**
     * 执行方法名
     */
    private String methodName;
    /**
     * 执行方法的参数数组
     */
    private Object[] params;
    /**
     * 执行方法的参数类型数组
     */
    private Class[] paramTypes;

    public Event() {

    }

    public Event(Object observer, String methodName, Object... params) {
        this.observer = observer;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(params);
    }

    /**
     * 根据参数数组生成参数类型数组
     */
    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            paramTypes[i] = params[i].getClass();
        }
    }

    /**
     * 利用反射的方式执行observer的更新方法，这样就不需要依赖于抽象接口
     */
    public void invoke() throws Exception {
        Method method = observer.getClass().getMethod(methodName, paramTypes);
        method.invoke(observer, params);
    }

    public Object getObserver() {
        return observer;
    }

    public void setObserver(Object observer) {
        this.observer = observer;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }
}
