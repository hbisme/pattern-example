package memento;

/**
 * @author hubin
 * @date 2023年01月07日 19:32
 */
public class App {
    public static void main(String[] args) {
        DraftsBox draftsBox = new DraftsBox();

        Editor editor = new Editor("spring小计", "文章的开头...", "1223.png");

        ArticleMemento articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);

        System.out.println(editor + " -暂存成功");

        System.out.println("========首次修改文章===========");

        editor.setTitle("[原创]spring小计");
        editor.setContend("文章的开头..., 文章的中间");
        System.out.println(editor + "-首次修改后的内容");
        System.out.println("========首次修改文章完成===========");
        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);

        System.out.println("========保存到草稿箱===========");


        System.out.println("========第二次修改文章===========");
        editor.setTitle("[原创]手写spring");
        editor.setContend("文章的开头..., 文章的中间..., 文章的结尾 ");
        System.out.println(editor + "-第二次修改后的内容");
        System.out.println("========第二次修改文章完成===========");

        System.out.println("========第一次撤销===========");
        ArticleMemento memento = draftsBox.getMemento();
        editor.undoFromMemento(memento);
        System.out.println(editor + "-第一次撤销完成");

        System.out.println("========第二次撤销===========");
        memento = draftsBox.getMemento();
        editor.undoFromMemento(memento);
        System.out.println(editor + "-第二次撤销完成");


    }
}
