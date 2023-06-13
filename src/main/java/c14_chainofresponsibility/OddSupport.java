package c14_chainofresponsibility;

/**
 * 处理奇数number的trouble
 */
public class OddSupport extends Support{
    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNumber()%2==1;
    }
}
