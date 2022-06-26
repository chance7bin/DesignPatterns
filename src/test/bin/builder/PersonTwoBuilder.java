package test.bin.builder;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class PersonTwoBuilder implements PersonBuilder{

    private Person person = new Person();

    @Override
    public void buildHead() {
        person.add("buildHead 2");
    }

    @Override
    public void buildArms() {
        person.add("buildArms 2");
    }

    @Override
    public void buildBody() {
        person.add("buildBody 2");
    }

    @Override
    public void buildLegs() {
        person.add("buildLegs 2");
    }

    public Person getPerson() {
        return person;
    }
}
