package adapter.interfaceAdapter;

/**
 * @author hubin
 * @date 2023年01月04日 20:07
 */
public interface ILoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
