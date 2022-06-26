package test.bin.observer;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/20
 */
public class ObserverTest {
    public static void main(String[] args) {
        Notifier notifier = new ConcreteNotifier();
        Observer observer1 = new ConcreteObserver("a", notifier);
        Observer observer2 = new ConcreteObserver("b", notifier);
        notifier.attach(observer1);
        notifier.attach(observer2);
        notifier.setState("老板来啦");
        notifier.notify2Observer();
        notifier.detach(observer2);
        notifier.notify2Observer();
    }
}
