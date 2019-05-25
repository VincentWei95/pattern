package factory.abstract_factory;

public class AccessDepartment implements IDepartment {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("access插入department:" + department.getId() + "," + department.getDepartment());
    }

    @Override
    public Department getDepartment(long id) {
        System.out.println("access获取department:" + id);
        return null;
    }
}
