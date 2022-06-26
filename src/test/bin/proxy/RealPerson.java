package test.bin.proxy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class RealPerson implements Person{
    @Override
    public void giveFlower() {
        System.out.println("送花");
    }

    @Override
    public void giveGift() {
        System.out.println("送礼物");
    }

    @Override
    public void singing() {
        System.out.println("唱歌");
    }
}
