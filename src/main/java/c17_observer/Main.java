package c17_observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        generator.addObserver(new DigitObserver());
        generator.addObserver(new GraphObserver());
        generator.execute();
    }
}
