package test.bin.memento;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/10
 */
public class Originator {

    // 需要保存的属性，可能有多个

    int hp = 100;
    int attack = 10;
    int defence = 10;

    public Memento save(){
        // 创建备忘录,将当前需要保存的信息导入并实例化出一个Memento对象
        return new Memento(attack,defence);
    }

    public void grow(){
        hp += 10;
        attack += 10;
        defence += 10;
        System.out.println("grow...");
    }

    public void reload(Memento memento){
        // 恢复备忘录，将 Memento导入并将相关数据恢复
        attack = memento.attack;
        defence = memento.defence;
        System.out.println("reload...");
    }

    @Override
    public String toString() {
        return "Originator{" +
            "hp=" + hp +
            ", attack=" + attack +
            ", defence=" + defence +
            '}';
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
