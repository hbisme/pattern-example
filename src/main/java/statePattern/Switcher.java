package statePattern;

public class Switcher {
    private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switcherOn() {
        //这里调用的是当前状态的开方法, 注意这里参数用的是this
        state.switchOn(this);
    }

    public void switcherOff() {
        //这里调用的是当前状态的关方法, 注意这里参数用的是this
        state.switchOff(this);
    }
}
