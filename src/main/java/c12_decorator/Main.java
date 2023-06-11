package c12_decorator;

import com.sun.org.apache.xerces.internal.impl.dv.xs.FullDVFactory;

public class Main {
    public static void main(String[] args) {
        StringDisplay d1 = new StringDisplay("hello,world");
        SideBorder d2 = new SideBorder(d1,'#');
        FullBorder d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();

        new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("hello,world")),'*'))),'/').show();

        StringDisplay o = new StringDisplay("o");
        FullBorder border =new FullBorder(o);
        for (int i = 0; i < 6; i++) {
            border = new FullBorder(border);
        }
        border.show();
    }
}
