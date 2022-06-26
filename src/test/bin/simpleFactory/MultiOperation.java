package test.bin.simpleFactory;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class MultiOperation implements IOperation{
    @Override
    public double getResult(double a, double b) {
        return a * b;
    }
}
