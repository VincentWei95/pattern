package proxy;

public class XiaoWang implements GiveGift {
    private MeiMei meiMei;

    public XiaoWang(MeiMei meiMei) {
        this.meiMei = meiMei;
    }

    @Override
    public void giveFlower() {
        System.out.println("小王送花给" + meiMei.getName());
    }

    @Override
    public void giveDolls() {
        System.out.println("小王送娃娃给" + meiMei.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println("小王送巧克力给" + meiMei.getName());
    }
}
