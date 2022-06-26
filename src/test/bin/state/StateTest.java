package test.bin.state;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/21
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context(new FirstState());
        context.setFlag(11);
        context.request();
        context.setFlag(13);
        context.request();
        context.setFlag(18);
        context.request();
    }
}
