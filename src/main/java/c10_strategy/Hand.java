package c10_strategy;

/**
 * 猜拳手势类，
 * 共三个实例，石头（0表示） 剪刀（1） 布（2）
 */
public class Hand {
    private int handValue;
    private String name;

    private Hand(int handValue,String name) {
        this.handValue = handValue;
        this.name=name;
    }

    private static final Hand[] hands=new Hand[]{
            new Hand(0,"石头"),new Hand(1,"剪刀"),new Hand(2,"布"),
    };

    public static Hand getHand(int handValue){
        return hands[handValue];
    }

    public boolean isStrongThan(Hand hand){
        return fight(hand)==1;
    }

    public boolean isWeakThan(Hand hand){
        return fight(hand)==-1;
    }

    /**
     * 比较两个手势大小
     * @param hand
     * @return 平手0，this赢1，this输-1
     */
    private int fight(Hand hand){
        if (this.handValue==hand.handValue){
            return 0;
        }else if ((this.handValue+1)%3==hand.handValue){
            return 1;
        }else {
            return -1;
        }
    }
}
