package c17_observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
    private Random random=new Random();
    private int number;

    @Override
    protected int getNumber() {
        number=random.nextInt(20);
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 10; i++) {
            getNumber();
            notifyObservers(this.number);
        }
    }
}
