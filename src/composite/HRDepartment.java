package composite;

public class HRDepartment extends Company {
    public HRDepartment(String name) {
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
        System.out.println(name + "人力管理培训");
    }
}
