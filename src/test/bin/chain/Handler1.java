package test.bin.chain;

import javax.lang.model.util.ElementScanner6;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class Handler1 extends Handler{

    @Override
    void request(int type) {
        if (type < 10){
            System.out.println("handler 1 print");
        }
        else if (super.successor != null) {
            super.successor.request(type);
        }
        else {
            System.out.println("can't solve");
        }
    }
}
