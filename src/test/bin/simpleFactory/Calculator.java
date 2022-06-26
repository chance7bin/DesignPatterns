package test.bin.simpleFactory;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println(Calculator.test("add",1,2));
        System.out.println(Calculator.test("multi",1,2));
    }

    public static double test(String op, double a, double b){
        OperationFactory factory = new OperationFactory();
        return factory.createOperate(op).getResult(a,b);
    }

}
