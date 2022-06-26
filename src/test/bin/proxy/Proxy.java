package test.bin.proxy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class Proxy implements Person{

    private Person real;

    public Proxy(Person real) {
        this.real = real;
    }

    @Override
    public void giveFlower() {
        real.giveFlower();
    }

    @Override
    public void giveGift() {
        real.giveGift();
    }

    @Override
    public void singing() {
        real.singing();
    }
}
