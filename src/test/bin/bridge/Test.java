package test.bin.bridge;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/10
 */
public class Test {
    public static void main(String[] args) {
        IOS ios = new IOS();
        ios.setSoftware(new Excel());
        ios.run();
        ios.setSoftware(new Word());
        ios.run();
    }
}
