package composite;

/**
 * 组合模式：
 * 定义：将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象
 * 和组合对象的使用具有一致性
 *
 * （简单理解：就是部分和整体使用同样的接口实现）
 *
 * 1、透明方式：实现Component接口的所有子类都具备Add()和Remove()，叶节点和支节点对于外界没有区别，
 * 具备完全一致的行为接口，但Leaf中也有Add()和Remove()，Leaf实现它们是没有任何意义的
 * 2、安全方式：Component接口中不去声明Add()和Remove()，在Composite声明Add()和Remove()，
 * Leaf也就不用去实现Add()和Remove()了，不过要做相应判断比较不便
 *
 * 使用场景：
 * 需求中是体现部分与整体层次的结构时，以及希望用户可以忽略组合对象与单个对象的不同，
 * 统一使用组合结构中的所有对象时，应该考虑使用组合模式
 *
 * 模式例子对象成员说明：
 * {@link Company}:组合接口，提供统一管理访问子Component的接口，公司组合接口
 * {@link ConcreteCompany}:组合接口实现类Composite，总部或分公司，维护公司下的子部门Component
 * {@link HRDepartment}:组合接口实现类Leaf，总部或分公司人力资源部门
 * {@link FinanceDepartment}:组合接口实现类Leaf，总部或分公司财务部门
 */
public class Main {

    public static void main(String[] args) {
        Company rootCompany = new ConcreteCompany("北京公司总部");
        rootCompany.add(new HRDepartment("北京公司总部人力资源部"));
        rootCompany.add(new FinanceDepartment("北京公司总部财务部"));

        Company shenzhenCompany = new ConcreteCompany("深圳分公司");
        shenzhenCompany.add(new HRDepartment("深圳分公司人力资源部"));
        shenzhenCompany.add(new FinanceDepartment("深圳分公司财务部"));
        rootCompany.add(shenzhenCompany);

        Company guangzhouCompany = new ConcreteCompany("广州分公司");
        guangzhouCompany.add(new HRDepartment("广州分公司人力资源部"));
        guangzhouCompany.add(new FinanceDepartment("广州分公司财务部"));
        rootCompany.add(guangzhouCompany);

        rootCompany.display();
        rootCompany.response();
    }
}
