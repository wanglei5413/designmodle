package c18_memento;

import c18_memento.game.Gamer;
import c18_memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("========  "+i);
            System.out.println("当前gamer状态："+gamer);

            gamer.bet();
            if (gamer.getMoney()>memento.getMoney()){
                System.out.println("钱增加了，保存游戏当前状态");
                memento=gamer.createMemento();

            }else if (gamer.getMoney()<memento.getMoney()){
                System.out.println("钱减少了，恢复游戏到之前状态");
                gamer.restoreFromMemento(memento);
            }
        }
        System.out.println(gamer);
    }
}
