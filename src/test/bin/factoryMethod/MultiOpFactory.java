package test.bin.factoryMethod;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class MultiOpFactory implements IFactory{
    @Override
    public IOperation createOperation() {
        return new MultiOperation();
    }
}
