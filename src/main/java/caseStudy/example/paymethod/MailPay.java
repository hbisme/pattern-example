package caseStudy.example.paymethod;

/**
 * @author hubin
 * @date 2023年01月07日 17:11
 */
public class MailPay implements PayMode {

    public MailPay(String address) {
        this.address = address;
    }

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String payName() {
        return "邮寄支付";

    }
}
