package c18_memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 游戏主人公
 */
public class Gamer {
    private int money;
    private List<String> fruits=new ArrayList<>();
    private Random random=new Random();
    private String[] fruitsName={"桃子","香蕉","草莓","猕猴桃"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void bet(){
        int count = random.nextInt(6) + 1;
        if (count==1){
            money+=100;
            System.out.println("钱增加了");
        }else if (count==2){
            money =money/2;
            System.out.println("钱减少了");
        }else if (count==6){
            money+=100;
            String fruit = getFruit();
            fruits.add(fruit);
            System.out.println("获得了水果："+fruit);
        }else {
            System.out.println("什么也没发生");
        }
    }

    private String getFruit() {
        String prifix="";
        if (random.nextBoolean()){
            prifix="好吃的";
        }
        return prifix + fruitsName[random.nextInt(fruitsName.length)];
    }

    public Memento createMemento(){
        Memento memento = new Memento(money);

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String f = iterator.next();
            if (f.startsWith("好吃的")){//只保存好吃的水果
                memento.addFruit(f);
            }
        }
        return memento;
    }

    public void restoreFromMemento(Memento memento){
        this.money= memento.money;
        this.fruits=memento.getFruits();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
