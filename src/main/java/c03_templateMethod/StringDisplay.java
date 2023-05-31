package c03_templateMethod;

/**
 * 打印字符串
 */
public class StringDisplay extends AbstractDisplay{

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        System.out.print("+");
        for (int i = 0; i < string.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");

    }

    @Override
    public void print() {
        System.out.println("+"+string+"+");
    }

    @Override
    public void close() {
        System.out.print("+");
        for (int i = 0; i < string.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
