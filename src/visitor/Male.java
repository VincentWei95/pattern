package visitor;

public class Male implements Person {
    @Override
    public void accept(Action action) {
        action.maleConclusion(this);
    }
}
