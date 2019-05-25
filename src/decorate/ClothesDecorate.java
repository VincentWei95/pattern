package decorate;

public class ClothesDecorate implements Decorate {
    private Human human;

    public ClothesDecorate(Human human) {
        this.human = human;
    }

    @Override
    public void show() {
        System.out.println("衣服");
        human.show();
    }
}
