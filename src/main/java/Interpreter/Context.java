package Interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文类,用来给解释器传递参数
 * tableName: 数据库表名
 * params: 修改时更新后的数据
 * wheres: where语句后的条件
 *
 */
public class Context {
    private String tableName;
    private Map<String, Object> params = new HashMap<>();
    private Map<String, Object> wheres = new HashMap<>();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public Map<String, Object> getWheres() {
        return wheres;
    }

    public void setWheres(Map<String, Object> wheres) {
        this.wheres = wheres;
    }
}
