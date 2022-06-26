package test.bin.templateMethod;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        Template person1 = new Person1();
        Template person2 = new Person2();
        person1.test1();
        person1.test2();
        person1.test3();
        person2.test1();
        person2.test2();
        person2.test3();
    }
}
