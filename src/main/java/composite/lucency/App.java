package composite.lucency;

/**
 *
 * 透明组合模式来实现树和叶子关系
 */
public class App {
    public static void main(String[] args) {
        Component root = new Composite("root");

        Component branchA = new Composite("---branchA");
        Component brancB = new Composite("------branchB");

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
