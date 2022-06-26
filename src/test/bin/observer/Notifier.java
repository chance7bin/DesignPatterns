package test.bin.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/20
 */
public class Notifier {
    List<Observer> observers = new ArrayList<>();
    String state;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notify2Observer(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
