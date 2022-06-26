package test.bin.flyweight;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class ConcreteFlyweight extends Flyweight{
    public ConcreteFlyweight(String name) {
        super(name);
    }

    @Override
    void use(String user) {
        System.out.println(super.name + " + " + user);
    }
}
