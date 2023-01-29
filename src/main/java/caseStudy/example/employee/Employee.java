package caseStudy.example.employee;

import caseStudy.example.pay.PayMode;

/**
 * @author hubin
 * @date 2023年01月07日 16:57
 */
public abstract class Employee {
    private Integer id;
    private String name;
    private String address;

    private PayMode payMode;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public PayMode getPayMode() {
        return payMode;
    }

    public void setPayMode(PayMode payMode) {
        this.payMode = payMode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    abstract public void pay();

}
