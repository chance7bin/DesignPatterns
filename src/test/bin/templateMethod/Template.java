package test.bin.templateMethod;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public abstract class Template {

    public void test1(){
        System.out.println("test1: " + answer1());
    }

    public void test2(){
        System.out.println("test2: " + answer2());
    }

    public void test3(){
        System.out.println("test3: " + answer3());
    }

    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();
}
