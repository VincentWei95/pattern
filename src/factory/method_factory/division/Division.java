package factory.method_factory.division;

import factory.method_factory.Operation;

public class Division extends Operation {
    @Override
    protected double getResult() {
        return numberA / numberB;
    }
}
