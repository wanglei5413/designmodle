package c05_singleton;

public class Main {
    public static void main(String[] args) {
        SingletonHungry instance1 = SingletonHungry.getInstance();
        SingletonHungry instance2 = SingletonHungry.getInstance();
        System.out.println(instance1==instance2);

        SingletonLazy s1 = SingletonLazy.getInstance();
        SingletonLazy s2 = SingletonLazy.getInstance();
        System.out.println(s1==s2);


    }
}
