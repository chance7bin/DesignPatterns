package test.bin.state;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/21
 */
public class Context {

    private int flag;
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlag() {
        return flag;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
