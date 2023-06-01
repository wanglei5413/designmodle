package c06_prototype;

public class MessageBox implements Product{
    private char mbChar='*';

    public MessageBox(char mbChar) {
        this.mbChar = mbChar;
    }

    @Override
    public void use(String info) {
        for (int i = 0; i < info.length()+4; i++) {
            System.out.print(mbChar);

            if (i==info.length()+3)
                System.out.println("");
        }

        System.out.print(mbChar+" ");
        System.out.print(info);
        System.out.println(" "+mbChar);

        for (int i = 0; i < info.length()+4; i++) {
            System.out.print(mbChar);

            if (i==info.length()+3)
                System.out.println("");
        }
    }

    @Override
    public Product createClone() {
        Product clone = null;
        try {
            clone = (Product)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Product) clone;
    }
}
