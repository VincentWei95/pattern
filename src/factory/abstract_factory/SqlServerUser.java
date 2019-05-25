package factory.abstract_factory;

public class SqlServerUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("sql server插入user:" + user.getId() + "," + user.getName());
    }

    @Override
    public User getUser(long id) {
        System.out.println("sql server获取user:" + id);
        return null;
    }
}
