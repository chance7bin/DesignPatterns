package test.bin.visitor;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/14
 */
public interface Element {
    void accept(Visitor visitor);
}
