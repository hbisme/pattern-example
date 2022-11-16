package demeter.example1.googCase;


/**
 * @author hubin
 * @date 2022年11月15日 17:38
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // 没必要暴露钱包
    // public Wallet getWallet() {
    //     return myWallet;
    // }

    public void pay(float payment) {
        if (myWallet.getTotalMoney() >= payment) {
            myWallet.subtractMoney(payment);
        } else {
            // 钱不够的情况
        }
    }
}
