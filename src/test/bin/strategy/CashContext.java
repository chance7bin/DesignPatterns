package test.bin.strategy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class CashContext {

    private Strategy strategy;

    public CashContext(Strategy strategy){
        this.strategy = strategy;
    }

    public double getResult(double money){
        return strategy.getResult(money);
    }

}
