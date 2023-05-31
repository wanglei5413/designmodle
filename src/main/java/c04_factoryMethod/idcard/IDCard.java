package c04_factoryMethod.idcard;

import c04_factoryMethod.framework.Product;

public class IDCard implements Product {
    private String name;

    public IDCard(String name) {
        this.name = name;
    }


    @Override
    public void use() {
        System.out.println(name+"在使用身份证");
    }
}
