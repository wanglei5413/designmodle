package c02_adapter.extend;

public class Main {

    public static void main(String[] args) {
        Print print=new PrintBanner("你好");

        print.printWeak();
        print.printStrong();
    }
}
