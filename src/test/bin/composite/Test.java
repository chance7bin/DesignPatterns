package test.bin.composite;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/10
 */
public class Test {
    public static void main(String[] args) {
        ConcreteComponent a = new ConcreteComponent("a");
        ConcreteComponent aa = new ConcreteComponent("aa");
        Leaf ab = new Leaf("ab");
        a.add(aa);
        a.add(ab);

        ConcreteComponent ac = new ConcreteComponent("ac");
        a.add(ac);
        Leaf aca = new Leaf("aca");
        ac.add(aca);

        Leaf aaa = new Leaf("aaa");
        aa.add(aaa);

        a.display(1);

    }

}
