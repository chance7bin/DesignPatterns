package test.bin.state;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/21
 */
public class SecondState implements State{
    @Override
    public void handle(Context context) {
        if (context.getFlag() < 17)
            System.out.println("second state");
        else {
            context.setState(new ThirdState());
            context.request();
        }
    }
}
