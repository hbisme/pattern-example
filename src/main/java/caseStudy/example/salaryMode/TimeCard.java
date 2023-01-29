package caseStudy.example.salaryMode;

import lombok.Data;

/**
 * @author hubin
 * @date 2023年01月07日 17:00
 */
@Data
public class TimeCard implements SalaryMode {
    private String date;
    private Double hours;
    // 每小时的工资
    private Double hourSalary;

    public TimeCard(String date, Double hours, Double hourSalary) {
        this.date = date;
        this.hours = hours;
        this.hourSalary = hourSalary;
    }

    @Override
    public String name() {
        return "时间卡-钟点工";
    }

    @Override
    public String payDate() {
        return "每周五发钱";
    }



    @Override
    public String toString() {
        return "TimeCard{" +
                "date='" + date + '\'' +
                ", hours=" + hours +
                ", hourSalary=" + hourSalary +
                '}';
    }


}
