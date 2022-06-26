package test.bin.decorator;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class Decorator extends Person{

    private Person component;

    public void setDecorator(Person component) {
        this.component = component;
    }

    @Override
    void show() {
        if (component != null)
            component.show();
    }
}
