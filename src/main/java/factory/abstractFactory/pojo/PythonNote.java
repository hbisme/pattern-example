package factory.abstractFactory.pojo;

import factory.abstractFactory.INote;

public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编辑python笔记");
    }
}
