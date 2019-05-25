package proxy;

public class XiaoMing implements GiveGift {
    private XiaoWang xiaoWang;

    public XiaoMing(MeiMei meiMei) {
        xiaoWang = new XiaoWang(meiMei);
    }

    @Override
    public void giveFlower() {
        xiaoWang.giveFlower();
    }

    @Override
    public void giveDolls() {
        xiaoWang.giveDolls();
    }

    @Override
    public void giveChocolate() {
        xiaoWang.giveChocolate();
    }
}
