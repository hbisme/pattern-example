package factory.sunnyProDemo;

/**
 * 发型工厂(简单工厂方法)
 */
public class HairFactory {

    /**
     * 根据类型(String)来创建发型对象
     */
    public HairInterface getHair(String type) {
        if ("left".equals(type)) {
            return new LeftHair();
        } else if ("right".equals(type)) {
            return new RightHair();
        }
        return null;
    }


    /**
     * 根据类名(String)来创建发型对象
     * */
    public HairInterface getHairByClass(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        HairInterface hair = (HairInterface) Class.forName(className).newInstance();
        return hair;
    }


}
