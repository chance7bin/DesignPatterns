package test.bin.strategy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class CashContextPro {

    private Strategy strategy;

    public CashContextPro(String op){
        switch (op){
            case "normal":{
                strategy = new CashNormal();
                break;
            }
            case "rebate":{
                strategy = new CashRebate(0.8);
                break;
            }
            case "return":{
                strategy = new CashReturn(200, 20);
                break;
            }
        }
    }

    public double getResult(double money){
        return strategy.getResult(money);
    }

}
