package factory.method_factory.addition;

import factory.method_factory.Operation;
import factory.method_factory.OperationFactory;

public class AdditionFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new Addition();
    }
}
