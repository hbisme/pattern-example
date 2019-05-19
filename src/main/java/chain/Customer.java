package chain;

import java.util.Random;

import chain.handler.PriceHandler;

/**
 * 客户,申请折扣
 */
public class Customer {

    private PriceHandler priceHandler;

    // 申请折扣
    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);

    }


    public PriceHandler getPriceHandler() {
        return priceHandler;
    }

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandler.createPriceHandler());

        Random rand = new Random();

        // 模拟10次折扣
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": ");
            customer.requestDiscount(rand.nextFloat());
        }


    }
}
