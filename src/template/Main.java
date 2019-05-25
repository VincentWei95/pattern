package template;

/**
 * 模板方法模式：
 * 定义：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 *
 * （简单理解：就是把重复的放到抽象类中，具体的实现由子类决定）
 *
 * 模式例子对象成员说明：
 * {@link TestPaper}:模板方法接口，测试卷模板，提供返回答案的接口
 * {@link TestPaper1}:模板方法接口实现类，一份测试卷答案
 * {@link TestPaper2}:模板方法接口实现类，一份测试卷答案
 */
public class Main {

    public static void main(String[] args) {
        TestPaper testPaper1 = new TestPaper1();
        testPaper1.question1();
        testPaper1.question2();
        testPaper1.question3();

        TestPaper testPaper2 = new TestPaper2();
        testPaper2.question1();
        testPaper2.question2();
        testPaper2.question3();
    }
}
