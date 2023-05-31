package c03_templateMethod;

/**
 * 模板类
 * 定义打印的流程框架
 */
public abstract class AbstractDisplay {

    public abstract void open();//钩子方法
    public abstract void print();//钩子方法
    public abstract void close();//钩子方法

    /**
     * 模板方法，定义打印流程
     * open->print5次->colse
     */
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
