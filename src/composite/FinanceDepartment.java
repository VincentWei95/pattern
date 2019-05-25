package composite;

public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    protected void add(Company company) {

    }

    @Override
    protected void remove(Company company) {

    }

    @Override
    protected void display() {
        System.out.println("-" + name);
    }

    @Override
    protected void response() {
        System.out.println(name + "财务管理培训");
    }
}
