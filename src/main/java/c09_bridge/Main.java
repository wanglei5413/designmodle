package c09_bridge;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("hello,world"));
        display.display();

        MutilDisplay mutilDisplay = new MutilDisplay(new StringDisplayImpl("hello,java"));
        mutilDisplay.multiDisplay(5);

    }
}
