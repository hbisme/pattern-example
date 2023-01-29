package caseStudy.example.employee;

import java.util.ArrayList;
import java.util.List;

import caseStudy.example.salaryMode.TimeCard;

/**
 * 钟点工，他们每天提交工作时间卡，其中记录了日期以及工作时辰数，
 * 如果每天工作超过6个时辰，按1.5倍进行支付。 每周五发工钱。
 *
 */
public class HourlyEmployee extends Employee {

    private List<TimeCard> timeCards;

    public HourlyEmployee(String name) {
        super(name + "-钟点工");
        this.timeCards = new ArrayList<>();

    }

    public void addTimeCard(TimeCard timeCard) {
        timeCards.add(timeCard);
    }

    public List<TimeCard> getTimeCards() {
        return timeCards;
    }

    /**
     * 计算钟点工的工资
     */
    public Double getSalary() {
        Double totalWage = io.vavr.collection.List.ofAll(timeCards).map(x -> {
            Double hours = x.getHours();
            double overtimeWage = 0;
            double wage = 0;
            if (hours > 6) {
                overtimeWage = overtimeWage + (hours - 6) * x.getHourSalary() * 1.5;
                wage = x.getHourSalary() * x.getHours() + overtimeWage;
            } else {
                wage = x.getHourSalary() * x.getHours();
            }
            return wage;
        }).reduce((x, y) -> (x + y));
        return totalWage;
    }

    @Override
    public void pay() {
        System.out.println(this.getName() + " " + "工资" + timeCards + " " + getPayMode().payName() + " 总工资为:" + getSalary());

    }
}
