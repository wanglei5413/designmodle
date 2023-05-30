package c02_adapter.extend;

/**
 * 填补 现有程序和所需程序 差异
 * 使用继承的实现的适配器
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String info) {
        super(info);
    }

    @Override
    public void printWeak() {
        this.showWithParen();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
