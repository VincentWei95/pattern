package build;

public class FatPersonBuilder implements PersonBuilder {
    private Person person;

    public FatPersonBuilder(Person person) {
        this.person = person;
    }

    @Override
    public void buildHead() {
        System.out.println("绘制胖子" + person.getName() + "的头");
    }

    @Override
    public void buildBody() {
        System.out.println("绘制胖子" + person.getName() + "的身");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("绘制胖子" + person.getName() + "的左手");
    }

    @Override
    public void buildArmRight() {
        System.out.println("绘制胖子" + person.getName() + "的右手");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("绘制胖子" + person.getName() + "的左腿");
    }

    @Override
    public void buildLegRight() {
        System.out.println("绘制胖子" + person.getName() + "的右腿");
    }
}
