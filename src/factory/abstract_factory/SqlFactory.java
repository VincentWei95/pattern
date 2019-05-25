package factory.abstract_factory;

public interface SqlFactory {
    IUser createUser();
    IDepartment createDepartment();
}
