package chain.example1.handler;

/**
 * 价格处理人,负责处理客户折扣申请
 */

public abstract class PriceHandler {

    /* 直接后继, 用于传递请求 */
    protected PriceHandler nextHandler;

    // PriceHandler的工厂方法,用于创建sales
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler vp = new VicePresident();

        // 设置直接后继
        sales.setNextHandler(manager);
        manager.setNextHandler(vp);

        return sales;
    }

    public PriceHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(PriceHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


    /* 处理折扣申请 */
    public abstract void processDiscount(float discount);

}
