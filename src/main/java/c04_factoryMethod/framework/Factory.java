package c04_factoryMethod.framework;

public abstract class Factory {

    public Product create(String name){
        Product product = createProduct(name);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String name);
    protected abstract void registerProduct(Product product);
}
