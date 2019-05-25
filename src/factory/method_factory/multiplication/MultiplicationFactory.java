package factory.method_factory.multiplication;

import factory.method_factory.Operation;
import factory.method_factory.OperationFactory;

public class MultiplicationFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new Multiplication();
    }
}
