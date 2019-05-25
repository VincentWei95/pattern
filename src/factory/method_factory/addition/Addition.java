package factory.method_factory.addition;

import factory.method_factory.Operation;

public class Addition extends Operation {
    @Override
    protected double getResult() {
        return numberA + numberB;
    }
}
