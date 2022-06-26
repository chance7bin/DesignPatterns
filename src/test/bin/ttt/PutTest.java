package test.bin.ttt;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author bin
 * @Date 2021/09/01
 */
public class PutTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("1", "2");
        System.out.println(map);
    }
}
