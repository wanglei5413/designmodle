package c01_gettingstart.iterator;

/**
 * 集合迭代器
 * @param <T>
 */
public interface Iterator<T> {
    /**
     * 判断是否有下一个元素
     * @return
     */
    boolean hashNext();

    /**
     * 返回下一个元素
     * @return
     */
    T next();
}
