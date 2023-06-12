package c13_visitor;

import java.util.Iterator;

/**
 * 数据结构元素功能接口
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public String toString(){
        return getName() + "(" + getSize() + ")";
    }

}
