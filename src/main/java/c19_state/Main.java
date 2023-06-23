package c19_state;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SafeFrame safeFrame = new SafeFrame("state sample");
        while (true){
            for (int i = 0; i < 24; i++) {
                safeFrame.setClock(i);
                Thread.sleep(1000);
            }
        }
    }
}
