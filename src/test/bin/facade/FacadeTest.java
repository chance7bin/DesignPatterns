package test.bin.facade;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class FacadeTest {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }
}
