package composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> childCompany = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    protected void add(Company company) {
        childCompany.add(company);
    }

    @Override
    protected void remove(Company company) {
        childCompany.remove(company);
    }

    @Override
    protected void display() {
        for (Company company : childCompany) {
            company.display();
        }
    }

    @Override
    protected void response() {
        for (Company company : childCompany) {
            company.response();
        }
    }
}
