package composite.save;

import java.util.ArrayList;
import java.util.List;



/**
 * 树枝节点
 *
 */
public class Composite extends composite.save.Component {
    private List<Component> components;

    public Composite(String name) {
        super(name);
        this.components = new ArrayList<Component>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component : this.components) {
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }


    public boolean addChild(Component component) {
        return components.add(component);
    }


    public boolean removeChild(Component component) {
        return components.remove(component);
    }


    public Component getChild(int index) {
        return components.get(index);
    }
}
