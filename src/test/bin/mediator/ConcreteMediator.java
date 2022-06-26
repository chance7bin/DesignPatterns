package test.bin.mediator;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class ConcreteMediator extends Mediator{

    Colleague1 colleague1;
    Colleague2 colleague2;

    public void setColleague1(Colleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    void send(String msg, Colleague colleague) {
        if (colleague instanceof Colleague1){
            colleague2.print(msg);
        }
        else
            colleague1.print(msg);
    }
}
