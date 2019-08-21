package Interpreter;

/**
 * SQL解释器基类
 *
 */
abstract class SQLExpression {

    public abstract String interpret(Context context);

}
