package c08_abstractfactory.factory;

/**
 * 抽象零件，项目
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
