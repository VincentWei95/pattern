package decorate;

public class UnderPantsDecorate implements Decorate {
    private Human human;

    public UnderPantsDecorate(Human human) {
        this.human = human;
    }

    @Override
    public void show() {
        System.out.println("内裤");
        human.show();
    }
}
