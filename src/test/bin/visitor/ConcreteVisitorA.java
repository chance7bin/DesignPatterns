package test.bin.visitor;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/14
 */
public class ConcreteVisitorA implements Visitor{

    String name;

    public ConcreteVisitorA(String name) {
        this.name = name;
    }

    @Override
    public void visitorElementA(ConcreteElementA element) {
        System.out.println(this.name + " visit " + element.getName());
    }

    @Override
    public void visitorElementB(ConcreteElementB element) {
        System.out.println(this.name + " visit " + element.getName());
    }
}
