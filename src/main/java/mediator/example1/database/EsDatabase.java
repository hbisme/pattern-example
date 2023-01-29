package mediator.example1.database;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体同事类
 */
public class EsDatabase extends AbstractDatabase {

    private List<String> dataset = new ArrayList<String>();

    public EsDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {
        System.out.println("Es添加数据: " + data);
        dataset.add(data);
    }

    @Override
    public void add(String data) {
        addData(data);
        // 数据同步作业交给中介者管理
        mediator.sync(AbstractDatabase.ELASTICSEARCH, data);
    }

    public void count() {
        int count = this.dataset.size();
        System.out.println("Elasticsearch 统计, 目前有 " + count + " 条数据,数据:" + dataset);
    }
}
