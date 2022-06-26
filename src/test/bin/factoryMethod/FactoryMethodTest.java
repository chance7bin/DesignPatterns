package test.bin.factoryMethod;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        System.out.println(test("add", 1, 2));
        System.out.println(test("multi", 1, 2));
    }

    public static double test(String op, double a, double b){
        IOperation operation = null;
        switch (op){
            case "add":{
                operation = (new AddOpFactory()).createOperation();
                break;
            }
            case "multi":{
                operation = (new MultiOpFactory()).createOperation();
                break;
            }
        }
        return operation.getResult(a,b);
    }
}
