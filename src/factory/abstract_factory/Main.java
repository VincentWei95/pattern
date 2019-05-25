package factory.abstract_factory;

import factory.abstract_factory.reflect.SqlReflectFactory;

/**
 * 抽象工厂模式：
 * 定义：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 *
 * （个人理解：抽象工厂模式是基于工厂方法模式上的写法，工厂方法是提供一个创建对象的接口，抽象工厂是提供多个创建不同对象的接口，
 * 只是一个创建一个对象，一个创建多个对象而已）
 *
 * 抽象工厂模式的不足：
 * 1、在修改工厂对象的时候都需要把例如new SqlServerFactory()这句代码修改，如果调用的地方很多，就要修改多个位置
 * 2、新增对象工厂和新增业务创建时，需要修改{@link SqlFactory}提供创建对象的接口和新增工厂类
 * 解决方案：利用反射实现创建
 *
 * 模式例子对象成员说明：
 * {@link User}:用户对象，代表User数据库表
 * {@link Department}:部门对象，代表Department数据库表
 *
 * {@link IUser}:数据库对象接口，操作User数据库表的抽象接口
 * {@link SqlServerUser}:数据库对象接口实现类，使用SqlServer操作User表
 * {@link AccessUser}:数据库对象接口实现类，使用Access操作User表
 *
 * {@link IDepartment}:数据库对象接口，操作Department数据库表的抽象接口
 * {@link SqlServerDepartment}:数据库对象接口实现类，使用SqlServer操作Department表
 * {@link AccessDepartment}:数据库对象接口实现类，使用Access操作Department表
 *
 * {@link SqlFactory}:对象工厂接口，提供创建对象接口
 * {@link SqlServerFactory}:对象工厂接口实现类，创建SqlServer的对象工厂
 * {@link AccessFactory}:对象工厂实现类，创建Access的对象工厂
 *
 * {@link SqlReflectFactory}:简单工厂模式+反射创建对象工厂
 */
public class Main {

    public static void main(String[] args) {
        User user = new User(1L, "user");
        SqlFactory sqlFactory = new SqlServerFactory();
        IUser sqlServerUser = sqlFactory.createUser();
        sqlServerUser.insertUser(user);
        sqlServerUser.getUser(1L);

        Department department = new Department(1L, "department");
        SqlFactory accessFactory = new AccessFactory();
        IDepartment accessDepartment = accessFactory.createDepartment();
        accessDepartment.insertDepartment(department);
        accessDepartment.getDepartment(1L);

        // 利用反射的方式实现创建，字符串最好放在配置文件中，这里不列举
        IUser sqlServerReflectUser = SqlReflectFactory.createUser("factory.abstract_factory.SqlServerUser");
        if (sqlServerReflectUser != null) {
            sqlServerReflectUser.insertUser(user);
            sqlServerReflectUser.getUser(1L);
        }
        IDepartment accessReflectDepartment = SqlReflectFactory.createDepartment("factory.abstract_factory.AccessDepartment");
        if (accessReflectDepartment != null) {
            accessReflectDepartment.insertDepartment(department);
            accessReflectDepartment.getDepartment(1L);
        }
    }
}
