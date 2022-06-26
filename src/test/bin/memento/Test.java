package test.bin.memento;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/10
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        System.out.println(originator);
        // 保存状态时，由于有了很好的封装,可以隐藏 Originator的实现细节
        careTaker.setMemento(originator.save());
        originator.grow();
        System.out.println(originator);
        originator.reload(careTaker.getMemento());
        System.out.println(originator);
    }
}
