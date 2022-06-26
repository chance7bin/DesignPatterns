package test.bin.state;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/21
 */
public class ThirdState implements State{
    @Override
    public void handle(Context context) {
        System.out.println("third state");
    }
}
