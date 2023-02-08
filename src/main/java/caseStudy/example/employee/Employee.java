package caseStudy.example.employee;

import caseStudy.example.payclassification.PaymentClassification;
import caseStudy.example.paymentSchedule.PaymentSchedule;
import caseStudy.example.paymethod.PayMode;

/**
 * @author hubin
 * @date 2023年01月07日 16:57
 */
public abstract class Employee {
    private Integer id;
    private String name;
    private String address;

    // 支付方式
    private PayMode payMode;

    // 支付策略
    private PaymentClassification paymentClassification;

    // 支付时间
    private PaymentSchedule paymentSchedule;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public PayMode getPayMode() {
        return payMode;
    }

    public void setPayMode(PayMode payMode) {
        this.payMode = payMode;
    }

    public PaymentClassification getPaymentClassification() {
        return paymentClassification;
    }

    public void setPaymentClassification(PaymentClassification paymentClassification) {
        this.paymentClassification = paymentClassification;
    }

    public PaymentSchedule getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }

    abstract public void pay();

}
