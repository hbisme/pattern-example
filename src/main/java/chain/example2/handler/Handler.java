package chain.example2.handler;

import chain.example2.Member;

/**
 * @author hubin
 * @date 2023年01月05日 13:08
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void next(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void doHandler(Member member);
}
