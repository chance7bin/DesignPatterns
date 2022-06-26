package test.bin.builder;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class Director {

    public void construct(PersonBuilder personBuilder) {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArms();
        personBuilder.buildLegs();
    }
}
