package factory.abstract_factory;

public class Department {
    private long id;
    private String department;

    public Department() {

    }

    public Department(long id, String department) {
        this.id = id;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
