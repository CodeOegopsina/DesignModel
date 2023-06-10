package FactoryMethod.idcard;

import FactoryMethod.frame.Factory;
import FactoryMethod.frame.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IDCardFactory
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/9 16:00
 * @Version 1.0
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return  owners;
    }
}
