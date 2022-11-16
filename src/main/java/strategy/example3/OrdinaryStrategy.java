package strategy.example3;

/**
 * 普通用户的测试,无折扣
 * @author hubin
 * @date 2022年03月07日 10:32 上午
 */
public class OrdinaryStrategy implements Strategy{
    @Override
    public Double calculatePrice(Double price) {
        return price;
    }
}
