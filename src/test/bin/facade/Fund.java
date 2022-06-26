package test.bin.facade;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class Fund {
    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;

    public Fund() {
        stock1  = new Stock1();
        stock2  = new Stock2();
        stock3  = new Stock3();
    }

    public void buy(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }

    public void sell(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }

}
