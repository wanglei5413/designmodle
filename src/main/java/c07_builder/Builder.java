package c07_builder;

/**
 * 文档建造者接口
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItem(String[] items);
    public abstract void close();

}
