package test.bin.adapter;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/21
 */
public class Player {
    String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    void attack(){
        System.out.println(name + " 冲啊");
    };
    void defend(){
        System.out.println(name + " 防啊");
    };
}
