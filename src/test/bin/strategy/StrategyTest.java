package test.bin.strategy;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class StrategyTest {

    public static void main(String[] args) {
        System.out.println(StrategyTest.test2("normal", 200));
        System.out.println(StrategyTest.test2("rebate", 200));
        System.out.println(StrategyTest.test2("return", 200));
    }

    public static double test2(String op,double money){
        return new CashContextPro(op).getResult(money);
    }


    public static double test(String op,double money){
        CashContext cashContext = null;
        switch (op){
            case "normal":{
                cashContext = new CashContext(new CashNormal());
                break;
            }
            case "rebate":{
                cashContext = new CashContext(new CashRebate(0.8));
                break;
            }
            case "return":{
                cashContext = new CashContext(new CashReturn(200, 20));
                break;
            }
        }

        return cashContext.getResult(money);
    }

}
