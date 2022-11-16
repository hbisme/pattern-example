package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 根节点
 *
 * @author hubin
 * @date 2022年03月04日 4:43 下午
 */
public class RootNode extends Node {
    private List<Node> childNodes = new ArrayList<>();

    public RootNode(String name) {
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
        throw new RuntimeException("根节点不支持加父节点");
    }

    @Override
    List<Node> getChilds() {
        return childNodes;
    }

    @Override
    List<Node> getParenets() {
        throw new RuntimeException("根节点没有父节点");
    }

    @Override
    boolean hasChild() {
        return !childNodes.isEmpty();
    }

    /**
     * 深度优先展示
     */
    @Override
    String display() {
        for (Node childNode : childNodes) {
            System.out.println(childNode.getName());
            if(childNode.hasChild()) {
                childNode.display();
            }

        }
        return null;
    }


}
