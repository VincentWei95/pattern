package response;

public abstract class Manager {
    protected Manager superior;

    public Manager(Manager superior) {
        this.superior = superior;
    }

    protected abstract void handleRequest(Request request);
}
