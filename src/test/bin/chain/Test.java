package test.bin.chain;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class Test {
    public static void main(String[] args) {
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        int[] test = {5,15,25,35};
        for (int i : test) {
            handler1.request(i);
        }
    }
}
