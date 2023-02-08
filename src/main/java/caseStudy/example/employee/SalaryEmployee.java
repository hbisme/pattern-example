// package caseStudy.example.employee;
//
// import java.util.List;
//
// import caseStudy.example.salaryMode.SalesReceipt;
//
// /**
//  * 销售,根据销售凭证来获得佣金
//  * 每隔一周的周五发一次工钱。
//  */
// public class SalaryEmployee extends Employee{
//     public SalaryEmployee(String name) {
//         super(name + "-佣金销售");
//     }
//
//     // private List<SalesReceipt> salesReceipts = io.vavr.collection.List.<SalesReceipt>empty().toJavaList();
//
//     // public boolean addSaleReceipt(SalesReceipt salesReceipt) {
//     //     return salesReceipts.add(salesReceipt);
//     // }
//     //
//     // public Double getSalary() {
//     //     Number totalWage = io.vavr.collection.List.ofAll(salesReceipts).map(x -> {
//     //         double wage = x.getCount() * x.getAmount() * x.getRatio();
//     //         return wage;
//     //     }).sum();
//     //     return (Double)totalWage;
//     // }
//
//     @Override
//     public void pay() {
//         System.out.println(this.getName() + " " + "工资" + salesReceipts + " " + getPayMode().payName() + " 总工资为:" + getSalary());
//
//
//     }
// }
