package chain.handler;

/**
 * 副总裁,能批准所有折扣.
 */
public class VicePresident extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount < 0.20) {
            System.out.format("%s 批准了折扣: %.2f%n", this.getClass(), discount);
        } else {
            System.out.format("%s 拒绝了折扣: %.2f%n", this.getClass(), discount);
        }
    }
}
