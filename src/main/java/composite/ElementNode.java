package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 普通的树形节点, 可以有父节点和子节点
 *
 * @author hubin
 * @date 2022年03月04日 4:42 下午
 */
public class ElementNode extends Node {

    List<Node> childNodes = new ArrayList();
    List<Node> parentNodes = new ArrayList();

    public ElementNode(String name) {
        super(name);
    }

    @Override
    Node add(Node node) {
        childNodes.add(node);
        node.setParent(this);
        return this;
    }

    @Override
    Node setParent(Node node) {
        parentNodes.add(node);
        return this;
    }

    @Override
    List<Node> getChilds() {
        return childNodes;
    }

    @Override
    List<Node> getParenets() {
        return null;
    }

    @Override
    String display() {
        for (Node childNode : childNodes) {
            System.out.println(childNode.getName());
            if (childNode.hasChild()) {
                childNode.display();
            }

        }
        return null;
    }

    @Override
    boolean hasChild() {
        return !childNodes.isEmpty();
    }


}
