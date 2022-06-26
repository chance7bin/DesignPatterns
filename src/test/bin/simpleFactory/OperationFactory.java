package test.bin.simpleFactory;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class OperationFactory {
    public IOperation createOperate(String operate){
        IOperation operation = null;
        switch (operate){
            case "add":{
                operation = new AddOperation();
                break;
            }
            case "multi":{
                operation = new MultiOperation();
                break;
            }
        }
        return operation;
    }
}
