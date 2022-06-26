package test.bin.composite;

import java.util.Collections;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/10
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth,"-")) + name);
    }
}
