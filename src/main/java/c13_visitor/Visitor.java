package c13_visitor;

/**
 * 访问者抽象
 * 可以访问数据结构元素
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
