package test.bin.chain;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public abstract class Handler {
    Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void request(int type);
}
