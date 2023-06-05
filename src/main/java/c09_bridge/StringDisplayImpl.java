package c09_bridge;

/**
 * 增加实现类
 * 字符串打印
 */
public class StringDisplayImpl implements DisplayImpl{
    private String str;//打印的字符串
    private int size;//字符串长度

    public StringDisplayImpl(String str) {
        this.str = str;
        size=str.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
