package c10_strategy;

/**
 * 选手
 */
public class Player {
    private String name;
    private int winCount;
    private int loseCount;
    private int gameCount;

    private Strategy strategy;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose(){
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even(){
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                ", strategy=" + strategy +
                '}';
    }
}

