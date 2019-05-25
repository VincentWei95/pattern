package factory.simple_factory;

public class Addition extends Operation {
    @Override
    protected double getResult() {
        return numberA + numberB;
    }
}
