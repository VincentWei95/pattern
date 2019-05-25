package factory.abstract_factory;

public class AccessUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("access插入user:" + user.getId() + "," + user.getName());
    }

    @Override
    public User getUser(long id) {
        System.out.println("access获取user:" + id);
        return null;
    }
}
