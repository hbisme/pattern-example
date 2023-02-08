package caseStudy.example;

import caseStudy.example.employee.HbEmployee;
import caseStudy.example.payclassification.CommissionClassification;
import caseStudy.example.payclassification.HourlyClassification;
import caseStudy.example.payclassification.SalariedClassification;
import caseStudy.example.paymentSchedule.BiWeeklySchedule;
import caseStudy.example.paymentSchedule.MonthlySchedule;
import caseStudy.example.paymentSchedule.WeeklySchedule;
import caseStudy.example.paymethod.AccountPay;
import caseStudy.example.paymethod.DirectPay;
import caseStudy.example.paymethod.MailPay;
import caseStudy.example.salaryMode.SalaryCard;
import caseStudy.example.salaryMode.SalesReceipt;
import caseStudy.example.salaryMode.TimeCard;

/**
 * @author hubin
 * @date 2023年01月07日 17:16
 */
public class App2 {
    public static void main(String[] args) {
        HbEmployee hb = new HbEmployee("hb");

        AccountPay accountPay = new AccountPay("银行账号-hb");
        hb.setPayMode(accountPay);

        SalaryCard salaryCard = new SalaryCard();
        salaryCard.setSalary(100000D);

        SalariedClassification salariedClassification = new SalariedClassification();
        salariedClassification.setSalaryCard(salaryCard);

        hb.setPaymentClassification(salariedClassification);

        MonthlySchedule monthlySchedule = new MonthlySchedule();
        hb.setPaymentSchedule(monthlySchedule);

        hb.pay();

        System.out.println("------------");

        HbEmployee fsl = new HbEmployee("fsl");
        fsl.setAddress("臻蓝府-501");

        MailPay mailPay = new MailPay(fsl.getAddress());
        fsl.setPayMode(mailPay);

        TimeCard timeCard1 = new TimeCard("2022-01-07", 8D, 100D);

        HourlyClassification hourlyClassification = new HourlyClassification();
        hourlyClassification.addTimeCard(timeCard1);

        fsl.setPaymentClassification(hourlyClassification);

        WeeklySchedule weeklySchedule = new WeeklySchedule();
        fsl.setPaymentSchedule(weeklySchedule);

        fsl.pay();

        System.out.println("------------");
        HbEmployee fsy = new HbEmployee("fsy");
        DirectPay directPay = new DirectPay();
        fsy.setPayMode(directPay);

        SalesReceipt salesReceipt1 = new SalesReceipt("2022-01-07", 2, 200D, 0.2);
        CommissionClassification commissionClassification = new CommissionClassification();
        commissionClassification.addSaleReceipt(salesReceipt1);
        fsy.setPaymentClassification(commissionClassification);
        BiWeeklySchedule biWeeklySchedule = new BiWeeklySchedule();
        fsy.setPaymentSchedule(biWeeklySchedule);

        fsy.pay();

    }
}
