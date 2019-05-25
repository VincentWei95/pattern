package visitor;

public class Failure implements Action {
    @Override
    public void maleConclusion(Person male) {
        System.out.println("失败的男人是有原因的");
    }

    @Override
    public void femaleConclusion(Person female) {
        System.out.println("失败的女人是有原因的");
    }
}
