package caseStudy.example.employee;

import java.util.List;

import caseStudy.example.payclassification.CommissionClassification;
import caseStudy.example.payclassification.HourlyClassification;
import caseStudy.example.payclassification.SalariedClassification;
import caseStudy.example.salaryMode.SalaryCard;
import caseStudy.example.salaryMode.TimeCard;

/**
 * @author hubin
 * @date 2023年01月30日 14:21
 */
public class HbEmployee extends Employee {

    public HbEmployee(String name) {
        super(name);
    }

    @Override
    public void pay() {
        if (super.getPaymentClassification().getPaymentClassificationName().equals("销售-支付类型")) {
            CommissionClassification commissionClassification = (CommissionClassification) super.getPaymentClassification();
            System.out.println(this.getName() + " " + "工资" + commissionClassification.getSalesReceipts() + " " + getPayMode().payName() + " 总工资为:" + commissionClassification.getSalary() + " " + super.getPaymentSchedule().getPaymentScheduleName());
        } else if (super.getPaymentClassification().getPaymentClassificationName().equals("小时工-支付类型")) {
            HourlyClassification hourlyClassification = (HourlyClassification) super.getPaymentClassification();
            List<TimeCard> timeCards = hourlyClassification.getTimeCards();
            System.out.println(this.getName() + " " + "工资" + timeCards + " " + getPayMode().payName() + " 总工资为:" + hourlyClassification.getSalary() + " " + super.getPaymentSchedule().getPaymentScheduleName());


        } else {
            SalariedClassification paymentClassification = (SalariedClassification) super.getPaymentClassification();
            SalaryCard salaryCard = paymentClassification.getSalaryCard();
            System.out.println(this.getName() + " " + salaryCard.name() + "工资" + salaryCard.getSalary() + " " + getPayMode().payName() + " " + super.getPaymentSchedule().getPaymentScheduleName());

        }
    }
}
