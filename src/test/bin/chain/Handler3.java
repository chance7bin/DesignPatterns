package test.bin.chain;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class Handler3 extends Handler{
    @Override
    void request(int type) {
        if (type < 30){
            System.out.println("handler 2 print");
        }
        else if (super.successor != null) {
            super.successor.request(type);
        }
        else {
            System.out.println("can't solve");
        }
    }
}
