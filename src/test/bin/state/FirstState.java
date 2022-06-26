package test.bin.state;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/21
 */
public class FirstState implements State{
    @Override
    public void handle(Context context) {
        if (context.getFlag() < 12)
            System.out.println("first state");
        else {
            context.setState(new SecondState());
            context.request();
        }
    }
}
