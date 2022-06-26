package test.bin.flyweight;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class Test {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight ali = flyweightFactory.getFlyweight("ali");
        Flyweight ali1 = flyweightFactory.getFlyweight("ali");
        Flyweight taobao = flyweightFactory.getFlyweight("taobao");
        Flyweight taobao1 = flyweightFactory.getFlyweight("taobao");
        Flyweight zijie = flyweightFactory.getFlyweight("zijie");
        ali.use("bin1"); //ali + bin1
        ali1.use("bin2"); //ali + bin2
        taobao.use("bin3"); //taobao + bin3
        taobao1.use("bin4"); //taobao + bin4
        zijie.use("bin5"); //zijie + bin5
        System.out.println(flyweightFactory.count()); //3

    }
}
