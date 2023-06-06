package c10_strategy;

import java.util.Random;

/**
 * 前一手赢，下一手一样策略
 */
public class WiningStrategy implements Strategy{
    private Hand prevHand;
    private boolean won=false;
    private Random random;

    public WiningStrategy() {
        random=new Random();
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand=Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        this.won=win;

    }

    @Override
    public String toString() {
        return "WiningStrategy";
    }
}
