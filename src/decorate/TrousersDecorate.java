package decorate;

public class TrousersDecorate implements Decorate {
    private Human human;

    public TrousersDecorate(Human human) {
        this.human = human;
    }

    @Override
    public void show() {
        System.out.println("裤子");
        human.show();
    }
}
