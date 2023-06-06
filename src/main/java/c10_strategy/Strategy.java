package c10_strategy;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
