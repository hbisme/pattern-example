package caseStudy.example.salaryMode;

import lombok.Data;

/**
 * 销售凭证
 *
 *
 */
@Data
public class SalesReceipt  implements  SalaryMode{
    private String date;
    private Integer count;
    // 销售额
    private Double amount;

    // 佣金提成的比例
    private Double ratio;

    public SalesReceipt(String date, Integer count, Double amount, Double ratio) {
        this.date = date;
        this.count = count;
        this.amount = amount;
        this.ratio = ratio;
    }

    @Override
    public String name() {
        return "佣金-销售";
    }

    @Override
    public String payDate() {
        return "每隔一周的周五发钱";
    }
}
