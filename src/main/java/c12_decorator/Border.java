package c12_decorator;

/**
 * 抽象装饰
 */
public abstract class Border extends Display{
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
