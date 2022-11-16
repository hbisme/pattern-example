package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hubin
 * @date 2022年03月04日 4:48 下午
 */
public class LeavesNode extends Node {

    List<Node> parentNodes = new ArrayList();


    public LeavesNode(String name) {
        super(name);
    }

    @Override
    Node add(Node node) {
        throw new RuntimeException("叶子节点不能增加子节点");
    }

    @Override
    Node setParent(Node node) {
        parentNodes.add(node);
        return this;
    }

    @Override
    List<Node> getChilds() {
        throw new RuntimeException("叶子节点没有子节点");
    }

    @Override
    List<Node> getParenets() {
        return parentNodes;
    }

    @Override
    String display() {
        System.out.println(name);
        return null;
    }

    @Override
    boolean hasChild() {
        return false;
    }
}
