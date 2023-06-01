package c06_prototype;

/**
 * 功能：字符串下划线
 */
public class UnderlinePen implements Product{
    private char ulChar='~';

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String info) {
        System.out.println(info);
        for (int i = 0; i < info.length(); i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product clone=null;
        try {
            clone = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
