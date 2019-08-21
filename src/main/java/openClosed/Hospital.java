package openClosed;

import java.math.BigDecimal;

/**
 * 医院类
 */
public class Hospital {
    private Medicine medicine = new Medicine("阿司匹林", 20.1);

    public Double getOrginalTotalPrice(int count) {
        return medicine.getPrice() * count;
    }


    public Double getRealTotalPrice(IPerson iPerson, int count) {
        return getOrginalTotalPrice(count) * iPerson.getRate();
    }


    public void sellMedicine(IPerson iPerson, int count) {
        System.out.println("卖" + count + "盒 阿司匹林给 " + iPerson.getType()  + iPerson.getName()
                + "原价: " + getOrginalTotalPrice(count) + " 报销后,实付: " + getRealTotalPrice(iPerson, count));

    }

}
