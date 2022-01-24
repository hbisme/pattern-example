package strategy.example.operator;

public class AddOperatorimpl implements Operator {
    @Override
    public Integer doOperation(int a, int b) {
        return a + b;
    }
}
