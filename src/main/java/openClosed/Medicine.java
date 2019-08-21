package openClosed;

import java.math.BigDecimal;

/**
 * 药品类
 */
public class Medicine {
    private String name;
    private Double price;

    public Medicine(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
