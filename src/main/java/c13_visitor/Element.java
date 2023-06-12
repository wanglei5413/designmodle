package c13_visitor;

/**
 * 表示数据结构的接口
 * 接受访问者访问
 */
public interface Element {
    public void accept(Visitor visitor);
}
