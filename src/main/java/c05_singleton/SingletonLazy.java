package c05_singleton;

/**
 * 懒汉式
 * 为了线程安全和并发性考虑,使用DCL(double check lock)
 *  为了禁止new 对象时指令重排序，使用volatile
 */
public class SingletonLazy {
    private static volatile SingletonLazy singleton;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singleton==null){
            synchronized (SingletonLazy.class){
                if (singleton==null){
                    singleton=new SingletonLazy();//可能发生指令重排序，
                }
            }
        }
        return singleton;

    }
}