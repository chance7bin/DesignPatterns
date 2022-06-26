package test.bin.visitor;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/14
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        ConcreteElementA elementA = new ConcreteElementA("element a");
        ConcreteElementB elementB = new ConcreteElementB("element b");
        objectStructure.attach(elementA);
        objectStructure.attach(elementB);
        objectStructure.display(new ConcreteVisitorA("visitor a"));
    }
}
