package test.bin.decorator;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/18
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    void show(){
        System.out.println(name + "穿衣服");
    };
}
