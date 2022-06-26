package test.bin.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/14
 */
public class ObjectStructure {
    List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }
    public void detach(Element element){
        elements.remove(element);
    }
    public void display(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
