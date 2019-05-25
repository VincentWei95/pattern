package factory.simple_factory;

public class Division extends Operation{
    @Override
    protected double getResult() {
        return numberA / numberB;
    }
}
