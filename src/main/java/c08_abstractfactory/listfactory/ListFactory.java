package c08_abstractfactory.listfactory;

import c08_abstractfactory.factory.Factory;
import c08_abstractfactory.factory.Link;
import c08_abstractfactory.factory.Page;
import c08_abstractfactory.factory.Tray;

public class ListFactory extends Factory {


    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
