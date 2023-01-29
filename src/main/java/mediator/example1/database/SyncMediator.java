package mediator.example1.database;

/**
 * 具体中介者
 */
public class SyncMediator extends AbstractMediator {
    @Override
    public void sync(String databaseName, String data) {
        if (databaseName.equals(AbstractDatabase.MYSQL)) {
            // mysql 同步到 redis 和 Elasticsearch
            this.redisDatabase.addData(data);
            this.esDatabase.addData(data);

        } else if (databaseName.equals(AbstractDatabase.REDIS)) {
            // redis 缓存同步，不需要同步到其他数据库
        } else if (databaseName.equals(AbstractDatabase.ELASTICSEARCH)) {
            // Elasticsearch 同步到 Mysql
            this.mysqlData.addData(data);
        }
    }
}
