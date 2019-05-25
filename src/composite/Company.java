package composite;

public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    protected abstract void add(Company company);
    protected abstract void remove(Company company);
    /**
     * 展示公司或部门
     */
    protected abstract void display();
    /**
     * 公司或部门职责
     */
    protected abstract void response();
}
