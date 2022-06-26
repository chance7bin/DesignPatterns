package test.bin.observer;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/20
 */
public class ConcreteObserver implements Observer{

    private String name;
    private Notifier notifier;

    public ConcreteObserver(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    @Override
    public void update() {
        System.out.println(name + ":" + notifier.getState());
    }
}
