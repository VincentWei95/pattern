package bridge;

public abstract class Brand {
    protected Soft soft;

    public void setSoft(Soft soft) {
        this.soft = soft;
    }

    abstract void run();
}
