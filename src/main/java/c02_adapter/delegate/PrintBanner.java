package c02_adapter.delegate;

/**
 * 填补 现有程序和所需程序之间差异
 */
public class PrintBanner extends Print{
    private String info;

    private Banner banner;

    public PrintBanner(String info) {
        this.banner=new Banner(info);
    }

    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
