package c10_strategy;

import java.util.Random;

/**
 * 根据之前的赢的概率决定下一手出什么。
 * 用二维数组记录连续两手赢次数。
 * 比如：history[0][0]=3,history[0][1]=5,history[0][2]=7
 * 表示
 * 前一手石头：后一手石头 共赢3次
 * 前一手石头：后一手剪刀 共赢5次
 * 前一手石头：后一手布 共赢7次
 * 当前如果是石头，则下一手出什么？由random产生一个数（0~15（3+5+7）），落在[0-3)出石头，落在[3-8)出石头，落在[8-15)出布
 *
 */
public class ProbStrategy implements Strategy{
    private int[][] history ={
        {1,1,1,}, {1,1,1,},{1,1,1,}
    };

    private int prevHandValue=0;
    private int currentHandValue=0;

    private Random random;

    public ProbStrategy() {
        this.random = new Random();
    }

    @Override
    public Hand nextHand() {
        int sum = history[currentHandValue][0] + history[currentHandValue][1] + history[currentHandValue][2];
        int r = random.nextInt(sum);

        int newHandValue=0;
        if (r<history[currentHandValue][0]){
            newHandValue=0;
        }else if (r<(history[currentHandValue][0]+history[currentHandValue][1])){
            newHandValue=1;
        }else {
            newHandValue=2;
        }
        prevHandValue=currentHandValue;
        currentHandValue=newHandValue;
        return Hand.getHand(currentHandValue);
    }

    @Override
    public void study(boolean win) {
        if (win){
            history[prevHandValue][currentHandValue]++;
        }else {
            history[prevHandValue][(currentHandValue+1)%3]++;
            history[prevHandValue][(currentHandValue+2)%3]++;
        }
    }

    @Override
    public String toString() {
        return "ProbStrategy";
    }
}
