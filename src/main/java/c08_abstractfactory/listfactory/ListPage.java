package c08_abstractfactory.listfactory;

import c08_abstractfactory.factory.Item;
import c08_abstractfactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><meta charset='UTF-8'/><title>"+title+"</title></head>\n");
        sb.append("<body>\n");
        sb.append("<ul>\n");
        Iterator<Item> iterator = content.iterator();
        while (iterator.hasNext()) {
            Item next = iterator.next();
            sb.append(next.makeHTML());
        }
        sb.append("</ul>");
        sb.append("<hr><address>"+author+"</address>");
        sb.append("</body>"+"</html>\n");
        return sb.toString();
    }
}
