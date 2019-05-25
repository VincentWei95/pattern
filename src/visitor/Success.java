package visitor;

public class Success implements Action {
    @Override
    public void maleConclusion(Person male) {
        System.out.println("成功的男人背后有一个伟大的女人");
    }

    @Override
    public void femaleConclusion(Person female) {
        System.out.println("成功的女人背后有一个不成功的男人");
    }
}
