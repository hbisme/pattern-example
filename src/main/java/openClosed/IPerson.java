package openClosed;

/**
 * 病人接口
 */
public interface IPerson {
    String getName();

    /**
     * @return 返回病人类型(一档,二档)
     */
    String getType();

    /**
     * @return 返回病人报销折扣率
     */
    Double getRate();


}


