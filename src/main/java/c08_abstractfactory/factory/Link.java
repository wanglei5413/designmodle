package c08_abstractfactory.factory;

/**
 * 抽象零件，html中的超链接
 */
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
