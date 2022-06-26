package test.bin.builder;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class Test {
    public static void main(String[] args) {
        PersonOneBuilder personOneBuilder = new PersonOneBuilder();
        PersonTwoBuilder personTwoBuilder = new PersonTwoBuilder();
        Director director = new Director();
        director.construct(personOneBuilder);
        director.construct(personTwoBuilder);
        System.out.println(personOneBuilder.getPerson());
        System.out.println(personTwoBuilder.getPerson());
    }
}
