package Interpreter;

import java.util.HashMap;
import java.util.Map;

public class SelectSQLExpression extends SQLExpression {
    @Override
    public String interpret(Context context) {
        String tableName = context.getTableName();
        StringBuilder select = new StringBuilder();
        select.append("SELECT * FROM ");
        select.append(tableName);

        // StringBuilder keys = new StringBuilder();
        StringBuilder whereValues = new StringBuilder();
        whereValues.append(" WHERE ");

        Map<String, Object> wheres = context.getWheres();

        for (String key : wheres.keySet()) {
            whereValues.append(key).append(" = ").append(wheres.get(key)).append(" AND ");
        }

        int size = whereValues.length();
        whereValues.delete(size - 4, size -1 );

        select.append(whereValues);

        System.out.println("interpret Select SQL : " + select.toString());

        return select.toString();
    }
}
