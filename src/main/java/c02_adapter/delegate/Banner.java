package c02_adapter.delegate;

/**
 * 现有程序
 */
public class Banner {

    private String info;

    public Banner(String info) {
        this.info = info;
    }

    /**
     * 信息加括号打印（info）
     */
    public void showWithParen(){
        System.out.println("(" + info + ")");
    }

    /**
     * 信息加星号打印 *info*
     */
    public void showWithAster(){
        System.out.println("*" + info + "*");
    }

}
