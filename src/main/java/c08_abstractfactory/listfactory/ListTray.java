package c08_abstractfactory.listfactory;

import c08_abstractfactory.factory.Item;
import c08_abstractfactory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb=new StringBuilder();
        sb.append("<li>\n").append(caption+"\n").append("<ul>\n");
        Iterator<Item> iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item next = iterator.next();
            sb.append(next.makeHTML());
        }
        sb.append("</ul></li>");
        return sb.toString();
    }
}
