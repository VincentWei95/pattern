package visitor;

public class Female implements Person {
    @Override
    public void accept(Action action) {
        action.femaleConclusion(this);
    }
}
