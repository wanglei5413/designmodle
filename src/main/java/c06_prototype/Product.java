package c06_prototype;

/**
 * 可以克隆自己实例接口
 */
public interface Product extends Cloneable{
    void use( String info);
    Product createClone();
}
