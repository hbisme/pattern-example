package caseStudy.example.pay;

/**
 * @author hubin
 * @date 2023年01月07日 17:12
 */
public class AccountPay implements PayMode{
    private String accountName;

    public AccountPay(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String payName() {
        return "转账到账号支付";
    }
}
