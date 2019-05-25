package factory.simple_factory;

public class Multiplication extends Operation{
    @Override
    protected double getResult() {
        return numberA * numberB;
    }
}
