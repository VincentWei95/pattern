package response;

/**
 * 职责链模式：
 * 定义：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
 *
 * （简单理解：就是每个操作对象都持有上级操作的引用，接收客户的请求不符合当前操作对象，
 * 就将请求抛给上级操作请求处理）
 *
 * 职责链模式的好处：
 * 1、客户提交一个请求时，请求是沿链传递直至有一个具体对象负责处理它
 * 2、接收者和发送者都没有对方的明确信息，且链中的对象自己也并不知道链的结构。
 * 结果是职责链可简化对象的相互连接，它们仅需保持一个指向其后继者的引用，而不需保持它所有的侯选接受者的引用
 * 3、可以随时增加或修改处理一个请求的结构。增强了给对象指派职责的灵活性
 *
 * 隐患：
 * 要注意一个请求极有可能到了末端都得不到处理，或者因为没有正确配置而得不到处理
 *
 * 模式例子对象成员说明：
 * {@link Manager}:处理请求的接口，提供处理请求的接口，管理者接口
 * {@link CommonManager}:处理请求接口实现类，持有上级请求对象引用，经理
 * {@link MajordomoManager}:处理请求接口实现类，持有上级请求对象引用，总监
 * {@link GeneralManager}:处理请求接口实现类，持有上级请求对象引用，总经理
 */
public class Main {

    public static void main(String[] args) {
        Manager generalManager = new GeneralManager(null);
        Manager majordomoManager = new MajordomoManager(generalManager);
        Manager commonManager = new CommonManager(majordomoManager);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("我要请假");
        request1.setRequestNumber(1);
        commonManager.handleRequest(request1);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("我要请假");
        request2.setRequestNumber(4);
        commonManager.handleRequest(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("我要加薪");
        request3.setRequestNumber(500);
        commonManager.handleRequest(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("我要加薪，不然走人");
        request4.setRequestNumber(1000);
        commonManager.handleRequest(request4);
    }
}
