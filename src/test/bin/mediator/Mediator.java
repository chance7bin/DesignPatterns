package test.bin.mediator;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public abstract class Mediator {

    abstract void send(String msg, Colleague colleague);
}
