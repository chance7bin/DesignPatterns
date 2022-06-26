package test.bin.mediator;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class Colleague1 extends Colleague{


    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void sendMessage(String msg) {
        super.mediator.send(msg, this);
    }

    @Override
    void print(String msg) {
        System.out.println("colleague 1 receive: " + msg);
    }
}
