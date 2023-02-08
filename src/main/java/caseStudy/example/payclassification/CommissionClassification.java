package caseStudy.example.payclassification;

import java.util.List;

import caseStudy.example.payclassification.PaymentClassification;
import caseStudy.example.salaryMode.SalaryCard;
import caseStudy.example.salaryMode.SalesReceipt;

/**
 * 销售-支付类型
 * 根据销售凭证来获得佣金
 * 每隔一周的周五发一次工钱。
 */
public class CommissionClassification implements PaymentClassification {
    private List<SalesReceipt> salesReceipts = io.vavr.collection.List.<SalesReceipt>empty().toJavaList();

    public boolean addSaleReceipt(SalesReceipt salesReceipt) {
        return salesReceipts.add(salesReceipt);
    }

    public List<SalesReceipt> getSalesReceipts() {
        return salesReceipts;
    }

    public Double getSalary() {
        Number totalWage = io.vavr.collection.List.ofAll(salesReceipts).map(x -> {
            double wage = x.getCount() * x.getAmount() * x.getRatio();
            return wage;
        }).sum();
        return (Double)totalWage;
    }

    @Override
    public String getPaymentClassificationName() {
        return "销售-支付类型";
    }
}
