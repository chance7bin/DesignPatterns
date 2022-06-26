package test.bin.commend;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public abstract class Commend {
    Receiver receiver;

    public Commend(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void execute();
}
