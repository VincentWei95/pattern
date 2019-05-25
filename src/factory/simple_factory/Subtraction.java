package factory.simple_factory;

public class Subtraction extends Operation {
    @Override
    protected double getResult() {
        return numberA - numberB;
    }
}
