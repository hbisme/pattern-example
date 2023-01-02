package composite.lucency;

/**
 *
 * 公共方法都定义在Component类中,这样的好处是客户端无需分辨是叶子节点还是根节点,他们具备完全一致的接口.
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("不支持获得子节点操作");
    }

}
