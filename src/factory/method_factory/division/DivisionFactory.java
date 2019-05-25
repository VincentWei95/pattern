package factory.method_factory.division;

import factory.method_factory.Operation;
import factory.method_factory.OperationFactory;

public class DivisionFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new Division();
    }
}
