package composite;

/**
 * @author hubin
 * @date 2022年03月04日 4:40 下午
 */
public class Main {
    public static void main(String[] args) {
        RootNode rootNode = new RootNode("根节点");
        ElementNode elementNode1 = new ElementNode("中间节点1");
        ElementNode elementNode2 = new ElementNode("中间节点2");
        LeavesNode leavesNode1 = new LeavesNode("叶子节点1");

        rootNode.add(elementNode1);
        rootNode.add(elementNode2);

        elementNode1.add(leavesNode1);
        elementNode2.add(leavesNode1);

        rootNode.display();






    }
}
