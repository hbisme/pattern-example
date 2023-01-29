package chain.example1.handler;


/**
 * 销售主管,能批准10%以内的折扣; 大于10%,传递给它的直接上级处理(副总裁).
 */
public class Manager extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount < 0.10) {
            System.out.format("%s 批准了折扣: %.2f%n", this.getClass(), discount);
        }else{
            nextHandler.processDiscount(discount);
        }
    }
}
