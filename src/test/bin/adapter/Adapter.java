package test.bin.adapter;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/21
 */
public class Adapter extends Player{

    private YAO yao = new YAO();

    public Adapter(String name) {
       yao.setName(name);
    }

    @Override
    void attack() {
        yao.jingong();
    }

    @Override
    void defend() {
        yao.fangshou();
    }
}
