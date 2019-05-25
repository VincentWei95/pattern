package response;

public class CommonManager extends Manager {
    public CommonManager(Manager superior) {
        super(superior);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getRequestType().equals("请假") && request.getRequestNumber() <= 2) {
            System.out.println("经理直接批准两天内的请假");
        } else {
            superior.handleRequest(request);
        }
    }
}
