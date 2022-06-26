package test.bin.mediator;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public abstract class Colleague {

    Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void sendMessage(String msg);

    abstract void print(String msg);

}
