package caseStudy.example;

import caseStudy.example.employee.HourlyEmployee;
import caseStudy.example.employee.OfficialEmployee;
import caseStudy.example.employee.SalaryEmployee;
import caseStudy.example.pay.AccountPay;
import caseStudy.example.pay.DirectPay;
import caseStudy.example.pay.MailPay;
import caseStudy.example.salaryMode.SalaryCard;
import caseStudy.example.salaryMode.SalesReceipt;
import caseStudy.example.salaryMode.TimeCard;

/**
 * @author hubin
 * @date 2023年01月07日 17:16
 */
public class App {
    public static void main(String[] args) {
        OfficialEmployee officialEmployee = new OfficialEmployee("hb");

        AccountPay accountPay = new AccountPay("银行账号-hb");
        officialEmployee.setPayMode(accountPay);

        SalaryCard salaryCard = new SalaryCard();
        salaryCard.setSalary(100000D);
        officialEmployee.setSalaryCard(salaryCard);

        officialEmployee.pay();

        System.out.println("------------");

        HourlyEmployee fsl = new HourlyEmployee("fsl");
        fsl.setAddress("臻蓝府-501");

        MailPay mailPay = new MailPay(fsl.getAddress());
        fsl.setPayMode(mailPay);

        TimeCard timeCard1 = new TimeCard("2022-01-07", 8D, 100D);
        fsl.addTimeCard(timeCard1);
        fsl.pay();

        System.out.println("------------");
        SalaryEmployee fsy = new SalaryEmployee("fsy");
        DirectPay directPay = new DirectPay();
        fsy.setPayMode(directPay);

        SalesReceipt salesReceipt1 = new SalesReceipt("2022-01-07", 2, 200D, 0.2);
        fsy.addSaleReceipt(salesReceipt1);
        fsy.pay();



    }
}
