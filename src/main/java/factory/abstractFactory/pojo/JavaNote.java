package factory.abstractFactory.pojo;

import factory.abstractFactory.INote;

/**
 * @author hubin
 * @date 2023年01月01日 12:17
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编辑java笔记");
    }
}
