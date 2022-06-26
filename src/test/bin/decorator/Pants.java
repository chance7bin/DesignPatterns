package test.bin.decorator;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class Pants extends Decorator{
    @Override
    void show() {
        System.out.println("裤子");
        super.show();
    }
}
