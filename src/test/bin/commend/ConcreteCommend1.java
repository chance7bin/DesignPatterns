package test.bin.commend;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class ConcreteCommend1 extends Commend{
    public ConcreteCommend1(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.action1();
    }
}
