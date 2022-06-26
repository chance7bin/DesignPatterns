package test.bin.visitor;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/14
 */
public interface Visitor {
    void visitorElementA(ConcreteElementA element);
    void visitorElementB(ConcreteElementB element);
}
