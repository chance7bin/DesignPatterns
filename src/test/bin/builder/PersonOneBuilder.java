package test.bin.builder;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class PersonOneBuilder implements PersonBuilder{

    private Person person = new Person();

    @Override
    public void buildHead() {
        person.add("buildHead 1");
    }

    @Override
    public void buildArms() {
        person.add("buildArms 1");
    }

    @Override
    public void buildBody() {
        person.add("buildBody 1");
    }

    @Override
    public void buildLegs() {
        person.add("buildLegs 1");
    }

    public Person getPerson() {
        return person;
    }
}
