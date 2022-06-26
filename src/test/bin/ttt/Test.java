package test.bin.ttt;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/01
 */
public class Test {
    public static void main(String[] args) {
        // Son son = new Son();
        // Test test = new Test();
        // test.test(son);
        B b = new B();
        b.setName("111");
        Test test = new Test();
        test.test2(b);

    }

    public void test2(A a){
        System.out.println(a);
    }

    public void test(Super s){
        s.print(new Person("222",1));
    }
}
