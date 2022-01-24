package strategy.example.operator;

public class SubOperatorImpl implements Operator {
    @Override
    public Integer doOperation(int a, int b) {
        return a - b;
    }
}
