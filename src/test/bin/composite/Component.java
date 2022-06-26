package test.bin.composite;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/10
 */
public abstract class Component {

    String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
