package c04_factoryMethod;

import c04_factoryMethod.framework.Factory;
import c04_factoryMethod.framework.Product;
import c04_factoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory= new IDCardFactory();
        Product product = factory.create("张三");
        product.use();


    }
}
