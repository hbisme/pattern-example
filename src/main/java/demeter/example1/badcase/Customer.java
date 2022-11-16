package demeter.example1.badcase;

/**
 * @author hubin
 * @date 2022年11月15日 17:34
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Wallet getWallet(){
        return myWallet;
    }
}
