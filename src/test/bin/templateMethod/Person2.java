package test.bin.templateMethod;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class Person2 extends Template{
    @Override
    public String answer1() {
        return "c";
    }

    @Override
    public String answer2() {
        return "b";
    }

    @Override
    public String answer3() {
        return "a";
    }
}
