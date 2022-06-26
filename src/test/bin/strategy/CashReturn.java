package test.bin.strategy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class CashReturn implements Strategy{

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double getResult(double money) {
        return money >= moneyCondition ? money - Math.floor(money / moneyCondition) * moneyReturn : money;
    }
}
