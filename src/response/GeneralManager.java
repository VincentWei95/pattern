package response;

public class GeneralManager extends Manager {
    public GeneralManager(Manager superior) {
        super(superior);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println("总经理批准任意天数的请假");
        } else if (request.getRequestType().equals("加薪") && request.getRequestNumber() <= 500){
            System.out.println("500元的加薪同意");
        } else if (request.getRequestType().equals("加薪") && request.getRequestNumber() > 500) {
            System.out.println("提薪再说吧");
        }
    }
}
