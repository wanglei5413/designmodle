package c08_abstractfactory.factory;

import java.util.ArrayList;

/**
 * 抽象零件，托盘（托盘上放一个一个项目）
 */
public abstract class Tray extends Item{
    protected ArrayList tray =new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
