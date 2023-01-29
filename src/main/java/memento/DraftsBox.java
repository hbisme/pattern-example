package memento;

import java.util.List;
import java.util.Stack;

/**
 * 草稿箱(备忘录管理角色)
 * @author hubin
 * @date 2023年01月07日 19:29
 */
public class DraftsBox {
    private final Stack<ArticleMemento> STACK = new Stack<>();
    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        STACK.push(articleMemento);
    }

}
