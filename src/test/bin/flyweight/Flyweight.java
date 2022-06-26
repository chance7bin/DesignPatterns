package test.bin.flyweight;



/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public abstract class Flyweight {
    String name;

    public Flyweight(String name) {
        this.name = name;
    }

    abstract void use(String user);
}
