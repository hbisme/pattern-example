package strategy.example3;

/**
 * @author hubin
 * @date 2022年03月07日 10:33 上午
 */
public class Vip1Strategy implements Strategy {
    @Override
    public Double calculatePrice(Double price) {
        return price * 0.9;
    }
}
