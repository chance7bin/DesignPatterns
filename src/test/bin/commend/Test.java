package test.bin.commend;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommend1 concreteCommend1 = new ConcreteCommend1(receiver);
        Invoker invoker = new Invoker(concreteCommend1);
        invoker.execute();
    }
}
