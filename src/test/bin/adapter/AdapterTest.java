package test.bin.adapter;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/21
 */
public class AdapterTest {

    public static void main(String[] args) {
        Player st = new ST("st");
        st.attack();
        Player cb = new CB("cb");
        cb.attack();
        Player yao = new Adapter("yao");
        yao.defend();
    }
}
