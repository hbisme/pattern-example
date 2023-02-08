package caseStudy.example.payclassification;

import caseStudy.example.salaryMode.SalaryCard;

/**
 * 正式员工-支付类型
 *
 * 每个月的最后一天给他们付工钱，
 * 有个月薪字段
 */
public class SalariedClassification implements PaymentClassification{
    private SalaryCard salaryCard;

    public SalaryCard getSalaryCard() {
        return salaryCard;
    }

    public void setSalaryCard(SalaryCard salaryCard) {
        this.salaryCard = salaryCard;
    }

    @Override
    public String getPaymentClassificationName() {
        return "正式员工-支付类型";
    }
}
