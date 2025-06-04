package level3.exercise1.model;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private String name;
    private final int ID;
    private static int salary = 1500;
    private List<News> editorNews;

    public Editor(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.editorNews = new ArrayList<News>();
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.ID;
    }

    public List<News> getEditorNews() {
        return this.editorNews;
    }

    public void setEditorNews(News editorNews) {
        this.editorNews.add(editorNews);
    }

    public String toString() {
        return this.name + ", ID: " + getID() + ", salario: " + Editor.salary + "€.";
    }
}