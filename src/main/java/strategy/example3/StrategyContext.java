package strategy.example3;

/**
 * @author hubin
 * @date 2022年03月07日 10:28 上午
 */
public class StrategyContext {

    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Double getPrice(Double price) {
        return strategy.calculatePrice(price);
    }

    public static void main(String[] args) {

        final StrategyContext strategyContext = new StrategyContext();
        final OrdinaryStrategy ordinaryStrategy = new OrdinaryStrategy();
        final Strategy vip1Strategy = new Vip1Strategy();
        final Strategy vip2Strategy = new Vip2Strategy();

        Double price = 100.0;

        // 选择无折扣的策略
        strategyContext.setStrategy(ordinaryStrategy);
        System.out.println("普通用户无折扣, 售价: " + strategyContext.getPrice(price));

        // 选择vip1的打折策略
        strategyContext.setStrategy(vip1Strategy);
        System.out.println("vip1的用户,9折, 售价: "  + strategyContext.getPrice(price));

        // 选择vip2的打折策略
        strategyContext.setStrategy(vip2Strategy);
        System.out.println("vip2的用户,9折, 售价: "  + strategyContext.getPrice(price));


    }
}
