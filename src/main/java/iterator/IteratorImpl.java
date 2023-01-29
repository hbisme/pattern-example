package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author hubin
 * @date 2023年01月05日 13:57
 */
public class IteratorImpl<E> implements Iterator {
    private List<E> list;
    private int cursor = 0;
    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    public IteratorImpl(Set<E> set) {
        this.list = new ArrayList<>(set);
    }

    @Override
    public Object next() {
        System.out.print("当前位置:" + cursor + ": ");
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if (cursor > list.size() - 1) {
            return false;
        } else {
            return true;
        }
    }
}
