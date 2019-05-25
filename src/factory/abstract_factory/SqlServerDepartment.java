package factory.abstract_factory;

public class SqlServerDepartment implements IDepartment {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("sql server插入department:" + department.getId() + "," + department.getDepartment());
    }

    @Override
    public Department getDepartment(long id) {
        System.out.println("sql server获取department:" + id);
        return null;
    }
}
