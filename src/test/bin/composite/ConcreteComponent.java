package test.bin.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/10
 */
public class ConcreteComponent extends Component {

    List<Component> children = new ArrayList<>();

    public ConcreteComponent(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth,"-")) + name);
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
