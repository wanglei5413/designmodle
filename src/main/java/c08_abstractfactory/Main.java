package c08_abstractfactory;

import c08_abstractfactory.factory.Factory;
import c08_abstractfactory.factory.Link;
import c08_abstractfactory.factory.Page;
import c08_abstractfactory.factory.Tray;

/**
 * java Main c08_abstractfactory.listfactory.ListFactory
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gm = factory.createLink("光明日报", "http://www.gmw.cn");

        Link yahoo = factory.createLink("Yahoo", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo,japan", "http://www.yahoo.com/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gm);

        Tray trayyahoo = factory.createTray("Yahoo");
        trayyahoo.add(yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("搜索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "xxx");
        page.add(traynews);
        page.add(traysearch);
        page.output();


    }
}
