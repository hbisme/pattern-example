package memento;

import lombok.Data;

/**
 * 编辑器类 (发起人角色)
 * @author hubin
 * @date 2023年01月07日 19:23
 */
@Data
public class Editor {
    private String title;
    private String contend;
    private String imgs;

    public Editor(String title, String contend, String imgs) {
        this.title = title;
        this.contend = contend;
        this.imgs = imgs;
    }

    public ArticleMemento saveToMemento() {
        ArticleMemento articleMemento = new ArticleMemento(this.title, this.contend, this.imgs);
        return articleMemento;
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.contend = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", contend='" + contend + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
