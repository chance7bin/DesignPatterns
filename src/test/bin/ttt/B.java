package test.bin.ttt;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/06
 */
public class B extends A{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
            "name='" + name + '\'' +
            '}';
    }
}
