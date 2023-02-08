package caseStudy.example.paymethod;

/**
 *
 * 支付方式-直接现场支付
 */
public class DirectPay implements PayMode{
    @Override
    public String payName() {
        return "直接现场支付";
    }
}
