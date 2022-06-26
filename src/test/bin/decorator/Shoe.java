package test.bin.decorator;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class Shoe extends Decorator{
    @Override
    void show() {
        System.out.println("鞋子");
        super.show();
    }
}
