package demeter.example1.badcase;

/**
 * @author hubin
 * @date 2022年11月15日 17:34
 */
public class Paperboy {
    public void pay(Customer myCustomer, float payment) {
        Wallet theWallet = myCustomer.getWallet();
        if (theWallet.getTotalMoney() > payment) {
            theWallet.subtractMoney(payment);
        } else {
            //money not enough
        }
    }
}
