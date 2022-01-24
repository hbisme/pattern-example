package strategy.example;

import strategy.example.operator.AddOperatorimpl;
import strategy.example.operator.Operator;
import strategy.example.operator.SubOperatorImpl;

public class CalcuatorApplication {
    // 策略接口
    private Operator operator;

    public Operator getOperator() {
        return operator;
    }

    // 可以更换不同的策略
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    // 使用策略来做事情
    public Integer doOperator(int a, int b) {
        return operator.doOperation(a, b);
    }


    /**
     * 计算器方法, 加法器,减法器都是实现同一个策略接口的类,可以被替换
     * 在主类中,有接口变量,然后通过set可以变换策略,
     */
    public static void main(String[] args) {
        CalcuatorApplication calcuatorApplication = new CalcuatorApplication();
        // 策略1
        AddOperatorimpl addOperatorimpl = new AddOperatorimpl();
        calcuatorApplication.setOperator(addOperatorimpl);
        Integer res = calcuatorApplication.doOperator(1, 2);
        System.out.println(res);


        // 策略2
        SubOperatorImpl subOperator = new SubOperatorImpl();
        calcuatorApplication.setOperator(subOperator);
        res = calcuatorApplication.doOperator(1,2);
        System.out.println(res);

    }
}
