package c20_flyweight;

import java.util.HashMap;

/**
 * flyweight工厂
 */
public class BigCharFactory {
    private HashMap<String,BigChar> pool=new HashMap<>();

    private static BigCharFactory bigCharFactory =new BigCharFactory();

    private BigCharFactory() {
    }
    public static BigCharFactory getInstance(){
        return bigCharFactory;
    }

    public BigChar getBigChar(char charName){
        BigChar bigChar = pool.get(charName + "");
        if (bigChar!=null){
            return bigChar;
        }
        else {
            bigChar = new BigChar(charName);
            pool.put(charName+"",bigChar);
            return bigChar;
        }
    }
}
