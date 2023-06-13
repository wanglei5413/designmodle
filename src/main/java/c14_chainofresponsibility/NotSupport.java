package c14_chainofresponsibility;

/**
 * 不解决任何问题
 */
public class NotSupport extends Support{
    public NotSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}
