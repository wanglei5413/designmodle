package c17_observer;

/**
 * 具体观察者
 * 显示数字
 */
public class DigitObserver implements Observer{
    @Override
    public void update(int number) {
        System.out.println("DigitObserver: "+ number);
    }
}
