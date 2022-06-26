package test.bin.flyweight;

import java.util.HashMap;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/13
 */
public class FlyweightFactory {

    HashMap<String,Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String name){
        if (!flyweights.containsKey(name)){
            flyweights.put(name,new ConcreteFlyweight(name));
        }
        return flyweights.get(name);
    }

    public int count(){
        return flyweights.size();
    }

}
