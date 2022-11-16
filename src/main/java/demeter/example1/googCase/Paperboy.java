package demeter.example1.googCase;


/**
 * @author hubin
 * @date 2022年11月15日 17:34
 */
public class Paperboy {
    /**
     * 钱是客户的,理应由客户自己来掏钱
     * @param myCustomer
     * @param payment
     */
    public void pay(Customer myCustomer, float payment) {
        myCustomer.pay(payment);
    }
}
