package response;

public class MajordomoManager extends Manager {
    public MajordomoManager(Manager superior) {
        super(superior);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getRequestType().equals("请假") && request.getRequestNumber() <= 5) {
            System.out.println("总监直接批准5天内的请假");
        } else {
            superior.handleRequest(request);
        }
    }
}
