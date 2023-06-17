package c17_observer;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 观察对象
 * 抽象的数字生成器
 */
public abstract class NumberGenerator {
    private LinkedList<Observer> observers=new LinkedList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(int number){
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(number);
        }
    }

    protected abstract int getNumber();
    public abstract void execute();

}
