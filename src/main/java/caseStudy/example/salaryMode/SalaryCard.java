package caseStudy.example.salaryMode;

/**
 * @author hubin
 * @date 2023年01月07日 17:05
 */
public class SalaryCard implements SalaryMode {
    // 固定的月薪
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String name() {
        return "固定工资-正式工";
    }

    @Override
    public String payDate() {
        return "每月月底发钱";
    }

    @Override
    public String toString() {
        return payDate() + " " + salary;


    }
}
