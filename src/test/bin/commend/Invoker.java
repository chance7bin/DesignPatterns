package test.bin.commend;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class Invoker {

    Commend commend;

    public Invoker(Commend commend) {
        this.commend = commend;
    }

    void execute(){
        commend.execute();
    }
}
