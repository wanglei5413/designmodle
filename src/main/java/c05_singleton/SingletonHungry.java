package c05_singleton;

/**
 * 饿汉式
 * 类初始化时会创建实例
 */
public class SingletonHungry {
    private static SingletonHungry singleton=new SingletonHungry();

    private SingletonHungry() {
        System.out.println("生成一个实例");
    }

    public static SingletonHungry getInstance(){
        return singleton;
    }
}
