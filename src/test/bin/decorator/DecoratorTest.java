package test.bin.decorator;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Person person = new Person("bin");
        Clothes clothes = new Clothes();
        Pants pants = new Pants();
        Shoe shoe = new Shoe();
        clothes.setDecorator(person);
        pants.setDecorator(clothes);
        shoe.setDecorator(pants);
        shoe.show();

    }

}
