package c04_factoryMethod.idcard;

import c04_factoryMethod.framework.Factory;
import c04_factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{
    private List<Product> list=new ArrayList<>();

    @Override
    protected Product createProduct(String name) {
        return new IDCard(name);
    }

    @Override
    protected void registerProduct(Product product) {
        list.add(product);
    }
}
