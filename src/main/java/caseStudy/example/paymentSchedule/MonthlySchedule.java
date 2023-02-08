package caseStudy.example.paymentSchedule;

/**
 * 每月月底支付
 */
public class MonthlySchedule implements PaymentSchedule {
    @Override
    public String getPaymentScheduleName() {
        return "每月月底支付";
    }
}
