package mediator.example1.database;

/**
 * 抽象同事类
 */
public abstract class AbstractDatabase {
    public static final String MYSQL = "mysql";
    public static final String REDIS ="redis";
    public static final String ELASTICSEARCH = "elasticsearch";

    protected AbstractMediator mediator;  // 中介者

    public AbstractDatabase(AbstractMediator mediator){
        this.mediator = mediator;
    }

    public abstract void addData(String data);

    // 外部调用接口
    public abstract void add(String data);


}
