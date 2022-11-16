package demeter.example1.badcase;

/**
 * @author hubin
 * @date 2022年11月15日 17:34
 */
public class Wallet {
    private float value;
    public float getTotalMoney() {
        return value;
    }
    public void setTotalMoney(float newValue) {
        value = newValue;
    }
    public void addMoney(float deposit) {
        value += deposit;
    }
    public void subtractMoney(float debit) {
        value -= debit;
    }
}
