package test.bin.proxy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealPerson());
        proxy.giveFlower();
        proxy.giveGift();
        proxy.singing();
    }
}
