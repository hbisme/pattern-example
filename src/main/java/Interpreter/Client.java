package Interpreter;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

        Context context = new Context();

        context.setTableName("table1");

        HashMap<String, Object> createParamsMap = new HashMap<String, Object>();
        createParamsMap.put("id", (Object) "1");
        createParamsMap.put("name", (Object) "hb");


        context.setParams(createParamsMap);
        InsertSQLExpression insertSQLExpression = new InsertSQLExpression();
        String str1 = insertSQLExpression.interpret(context);
        System.out.println(str1);


        HashMap<String, Object> selectWhereMap = new HashMap<String, Object>();
        selectWhereMap.put("id", 1);
        selectWhereMap.put("name", "hb");

        context.setWheres(selectWhereMap);
        SelectSQLExpression selectSQLExpression = new SelectSQLExpression();
        String selectStr = selectSQLExpression.interpret(context);
        System.out.println(selectStr);
    }
}
