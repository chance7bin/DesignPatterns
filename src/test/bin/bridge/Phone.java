package test.bin.bridge;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/10
 */
public abstract class Phone {
    Software software;

    public void setSoftware(Software software) {
        this.software = software;
    }

    abstract void run();
}
