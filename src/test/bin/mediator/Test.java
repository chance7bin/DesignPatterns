package test.bin.mediator;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Colleague1 colleague1 = new Colleague1(concreteMediator);
        Colleague2 colleague2 = new Colleague2(concreteMediator);
        concreteMediator.setColleague1(colleague1);
        concreteMediator.setColleague2(colleague2);

        colleague1.sendMessage("hello man");
        colleague2.sendMessage("see you man");

    }
}
