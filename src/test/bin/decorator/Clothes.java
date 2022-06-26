package test.bin.decorator;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class Clothes extends Decorator{
    @Override
    void show() {
        System.out.println("衣服");
        super.show();
    }
}
