package test.bin.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class Person {
    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    @Override
    public String toString() {
        return "Person{" +
            "parts=" + parts +
            '}';
    }
}
