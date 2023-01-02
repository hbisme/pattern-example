package composite.save;





/**
 * 安全组合模式来实现树和叶子关系
 */
public class App {
    public static void main(String[] args) {

        // 树枝节点类型不同于透明组合模式
        Composite root = new Composite("root");
        Composite branchA = new Composite("---branchA");
        Composite brancB = new Composite("------branchB");

        Component leafA = new Leaf("------leafA");
        Component leafB = new Leaf("-----------leafB");
        Component leafC = new Leaf("--leafC");

        root.addChild(branchA);
        root.addChild(leafC);

        branchA.addChild(leafA);
        branchA.addChild(brancB);
        brancB.addChild(leafB);

        System.out.println(root.operation());

    }
}
