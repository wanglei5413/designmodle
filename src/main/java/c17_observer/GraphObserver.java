package c17_observer;

/**
 * 具体观察者
 * 显示图像
 */
public class GraphObserver implements Observer{
    @Override
    public void update(int number) {
        System.out.print("GraphObserver: "+number+" ");

        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append("*");
        }
        System.out.println(sb.toString());
    }
}
