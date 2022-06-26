package test.bin.strategy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class CashNormal implements Strategy{
    @Override
    public double getResult(double money) {
        return money;
    }
}
