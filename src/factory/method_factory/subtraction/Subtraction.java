package factory.method_factory.subtraction;

import factory.method_factory.Operation;

public class Subtraction extends Operation {
    @Override
    protected double getResult() {
        return numberA - numberB;
    }
}
