package intermediary.example1.database;

import java.util.ArrayList;
import java.util.List;

public class MysqlDatabase extends AbstractDatabase {

    private List<String> dataset = new ArrayList<String>();

    public MysqlDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {
        System.out.println("Mysql 添加数据:" + data);
        this.dataset.add(data);
    }

    @Override
    public void add(String data) {
        addData(data);
        // 数据同步作业交给中介者管理
        this.mediator.sync(AbstractDatabase.MYSQL, data);
    }

    public void select() {
        System.out.println("mysql 查询, 数据: " + this.dataset.toString());
    }
}
