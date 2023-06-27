package c20_flyweight;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        int length = string.length();
        bigChars=new BigChar[length];
        for (int i = 0; i < length; i++) {
            bigChars[i]=BigCharFactory.getInstance().getBigChar(string.charAt(i));
        }
    }

    public void print(){
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
