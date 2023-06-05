package c09_bridge;

/**
 * 增加功能层次结构
 */
public class MutilDisplay extends Display{
    public MutilDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
