package c09_bridge;

/**
 * 类功能层次结构顶层类
 */
public class Display {
    private DisplayImpl impl;//连接两个层次结构的桥梁

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public void display(){
        open();
        print();
        close();
    }
}
