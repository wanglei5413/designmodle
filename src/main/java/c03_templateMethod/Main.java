package c03_templateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('A');
        charDisplay.display();

        AbstractDisplay stringDisplay = new StringDisplay("hello,world");
        stringDisplay.display();
    }
}
