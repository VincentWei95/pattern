package build;

/**
 * 构建者模式：
 * 定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * 如果使用了构建者模式，那么用户就只需指定需要建造的类型就可以得到它们，而具体建造的过程和细节就不需要知道了。
 *
 * 使用场景：
 * 当创建复杂对象的算法因该独立于该对象的组成部分以及它们的装配方式时适用的模式
 *
 * 模式例子对象成员说明：
 * {@link Person}:绘制对象
 *
 * {@link PersonBuilder}:构建者接口，具体的构建者都需要实现该接口
 * {@link ThinPersonBuilder}:构建者接口实现类，绘制瘦子的构建者
 * {@link FatPersonBuilder}:构建者接口实现类，绘制胖子的构建者
 * {@link PersonDirector}:构建的执行者，操作构建者执行流程的对象
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("小明");

        PersonBuilder thinPersonBuilder = new ThinPersonBuilder(person);
        PersonDirector thinPersonDirector = new PersonDirector(thinPersonBuilder);
        thinPersonDirector.construct();

        PersonBuilder fatPersonBuilder = new FatPersonBuilder(person);
        PersonDirector fatPersonDirector = new PersonDirector(fatPersonBuilder);
        fatPersonDirector.construct();

        // 构建者模式另一种写法
        new build.android.PersonBuilder.Builder()
                .head("head")
                .body("body")
                .armLeft("armLeft")
                .armRight("armRight")
                .legLeft("legLeft")
                .legRight("legRight")
                .build();
    }
}
