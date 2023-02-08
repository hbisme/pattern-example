package caseStudy.example.paymentSchedule;

/**
 * 每周五支付
 */
public class WeeklySchedule implements PaymentSchedule {
    @Override
    public String getPaymentScheduleName() {
        return "每周五支付";
    }
}
