package c12_decorator;

/**
 * 抽象装饰对象
 */
public abstract class Display {
    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);

    public void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
