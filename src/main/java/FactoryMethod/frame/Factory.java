package FactoryMethod.frame;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/9 15:32
 * @Version 1.0
 */
public abstract class Factory {

    public final Product create(String owner){

        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct (String owner);

    protected abstract void registerProduct (Product product);

}
