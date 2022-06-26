package test.bin.strategy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class CashRebate implements Strategy{

    private double rebate = 1;

    public CashRebate(){

    }

    public CashRebate(double rebate){
        this.rebate = rebate;
    }

    @Override
    public double getResult(double money) {
        return money * rebate;
    }
}
