package c08_abstractfactory.factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 抽象产品，html页面
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content=new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        try {
            String fileName=title+".html";
            FileWriter writer = new FileWriter(new File(fileName));
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(fileName+"编写完成");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
