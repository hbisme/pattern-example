package intermediary.database;


public abstract class AbstractMediator {

    protected MysqlDatabase mysqlData;
    protected RedisDatabase redisDatabase;
    protected EsDatabase esDatabase;

    public abstract void sync(String databaseName, String data);

    public MysqlDatabase getMysqlData() {
        return mysqlData;
    }

    public void setMysqlData(MysqlDatabase mysqlData) {
        this.mysqlData = mysqlData;
    }

    public RedisDatabase getRedisDatabase() {
        return redisDatabase;
    }

    public void setRedisDatabase(RedisDatabase redisDatabase) {
        this.redisDatabase = redisDatabase;
    }

    public EsDatabase getEsDatabase() {
        return esDatabase;
    }

    public void setEsDatabase(EsDatabase esDatabase) {
        this.esDatabase = esDatabase;
    }
}
