package Interpreter;

/**
 * Insert SQL 解释器类
 */
public class InsertSQLExpression extends  SQLExpression{
    @Override
    public String interpret(Context context) {
        StringBuilder insert = new StringBuilder();
        insert.append("insert into ")
                .append(context.getTableName());

        StringBuilder keys = new StringBuilder();
        StringBuilder values = new StringBuilder();

        keys.append("(");
        values.append("(");

        for (String key : context.getParams().keySet()) {
            keys.append(key).append(",");
            values.append(context.getParams().get(key)).append(",");
        }

        keys = keys.replace(keys.length() - 1, keys.length(), ")");
        values = values.replace(values.length() - 1, values.length(), ")");

        // 拼接keys values
        insert.append(keys)
                .append(" values ")
                .append(values);

        System.out.println("Insert SQL : " + insert.toString());
        return insert.toString();


    }
}
