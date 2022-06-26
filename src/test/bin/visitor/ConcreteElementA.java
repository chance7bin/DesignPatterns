package test.bin.visitor;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/14
 */
public class ConcreteElementA implements Element{
    String name;

    public ConcreteElementA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorElementA(this);
    }
}
