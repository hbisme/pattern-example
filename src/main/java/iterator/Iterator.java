package iterator;

/**
 * 迭代器接口
 * @author hubin
 * @date 2023年01月05日 13:55
 */
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
