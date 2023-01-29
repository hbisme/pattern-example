package adapter.interfaceAdapter;

import lombok.Data;

/**
 * @author hubin
 * @date 2023年01月04日 20:08
 */
@Data
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
