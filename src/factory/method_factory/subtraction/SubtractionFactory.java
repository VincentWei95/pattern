package factory.method_factory.subtraction;

import factory.method_factory.Operation;
import factory.method_factory.OperationFactory;

public class SubtractionFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new Subtraction();
    }
}
