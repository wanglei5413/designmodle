package c18_memento.game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录
 */
public class Memento {
    int money;
    ArrayList<String> fruits=new ArrayList<>();

    public int getMoney(){
        return money;
    }

    Memento(int money) {
        this.money = money;
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    List<String> getFruits(){
        return (ArrayList)fruits.clone();
    }

}
