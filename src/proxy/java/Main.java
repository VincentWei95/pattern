package proxy.java;

/**
 * java提供的动态代理，实现一个网页评分系统：
 * 如果是自己查看自己的王爷，可以修改内容，但不能评分；
 * 如果是别人查看自己的网页，可以评分，但不能修改内容
 * 实现权限访问限制功能
 */
public class Main {

    public static void main(String[] args) {
        Person person = new PersonImpl();
        ProxyHandler proxyHandler = new ProxyHandler(person);
        // 获取自己的代理，设定了不能评分
        Person ownProxy = proxyHandler.getOwnProxyHandler();
        try {
            ownProxy.setRating(5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        ownProxy.setName("test");
        System.out.println(ownProxy.getName());

        // 获取别人的代理，设定了除了评分不能修改内容
        Person nonOwnProxy = proxyHandler.getNonOwnProxyHandler();
        try {
            nonOwnProxy.setName("haha");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        nonOwnProxy.setRating(10);
        System.out.println(nonOwnProxy.getRating());
    }
}
