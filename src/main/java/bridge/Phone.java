package bridge;

/**
 * 手机抽象类代码
 * system 代表系统名称
 * software 代办要打开的软件
 * openSoftware() 对外提供打开软件的方法.
 *
 */
public abstract class Phone {
    private String system;
    private Software software;

    public abstract void openSoftware();


    // get-set...
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }


}
