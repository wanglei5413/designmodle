package c14_chainofresponsibility;

/**
 * 处理给定number的问题
 */
public class SpecialSupport extends Support{

    private  int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }


    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNumber()==number;
    }
}
