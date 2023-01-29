package chain.example1.handler;

/**
 * 底层销售人员,能批准5%以内的折扣; 大于5%,传递给它的直接上级处理(主管).
 */
public class Sales extends PriceHandler {

    @Override
    public void processDiscount(float discount) {

        if (discount < 0.05) {
            System.out.format("%s 批准了折扣: %.2f%n", this.getClass(), discount);
        } else {
            nextHandler.processDiscount(discount);
        }
    }

}
