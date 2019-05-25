package template;

public abstract class TestPaper {

    protected void question1() {
        System.out.println("问题答案:" + answer1());
    }

    protected void question2() {
        System.out.println("问题答案:" + answer2());
    }

    protected void question3() {
        System.out.println("问题答案:" + answer3());
    }

    protected abstract String answer1();
    protected abstract String answer2();
    protected abstract String answer3();
}
