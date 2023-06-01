package c06_prototype;

import java.util.HashMap;

public class Manager {
    private HashMap<String,Product> showCase =new HashMap<>();

    public void register(String pName,Product product){
        showCase.put(pName,product);
    }

    public Product createClone(String pName){
        Product product = showCase.get(pName);
        return product.createClone();
    }
}
