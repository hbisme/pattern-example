package caseStudy.example.paymentSchedule;

/**
 * 每隔一周的周五支付
 */
public class BiWeeklySchedule implements PaymentSchedule {
    @Override
    public String getPaymentScheduleName() {
        return "每隔一周的周五支付";
    }
}
