package flyweight;

/**
 * 享元模式：
 * 定义：运用共享技术有效地支持大量细粒度的对象
 *
 * （简单理解：享元模式就是为了减少大量相似对象的创建，将不同的外部需求抽离后，共享使用相似的对象）
 *
 * 使用场景：
 * 1、一个应用程序使用了大量的对象，而大量的对象造成了很大存储开销要考虑使用
 * 2、对象大多数状态可以是外部状态，如果删除对象的外部状态，可以用相对较少的共享对象取代很多组对象，可以考虑使用
 *
 * 模式例子对象成员说明：
 * {@link User}:用户对象model，代表需要创建网站的用户
 *
 * {@link Website}:Flyweight享元接口，提供接收外部状态接口，网站接口
 * {@link ConcreteWebsite}:Flyweight享元接口实现类，根据接口提供的外部状态判断是否处理，具体网站
 *
 * {@link WebsiteFactory}:Flyweight享元工厂，控制创建享元对象的数量，网站创建工厂
 */
public class Main {

    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        Website fx = websiteFactory.getWebsiteCategory("产品展示");
        fx.Use(new User("小明"));

        Website fy = websiteFactory.getWebsiteCategory("产品展示");
        fy.Use(new User("小王"));

        Website fz = websiteFactory.getWebsiteCategory("博客");
        fz.Use(new User("小鸟"));

        Website fm = websiteFactory.getWebsiteCategory("博客");
        fm.Use(new User("小胡"));

        System.out.println("创建了4个网站，实际搭建网站数量:" + websiteFactory.getWebsiteCount());
    }
}
