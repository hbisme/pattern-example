package composite;

import java.util.List;

/**
 * @author hubin
 * @date 2022年03月04日 4:40 下午
 */
public abstract class Node {

    String name;

    public Node(String name) {
        this.name = name;
    }

    abstract Node add(Node node);

    abstract Node setParent(Node node);

    abstract List<Node> getParenets();

    abstract List<Node> getChilds();

    public String getName() {
        return name;
    }

    abstract String display();

    abstract boolean hasChild();
}
