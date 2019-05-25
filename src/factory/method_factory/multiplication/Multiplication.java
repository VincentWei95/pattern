package factory.method_factory.multiplication;

import factory.method_factory.Operation;

public class Multiplication extends Operation {
    @Override
    protected double getResult() {
        return numberA * numberB;
    }
}
