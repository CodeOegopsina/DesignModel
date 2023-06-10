package FactoryMethod.idcard;

import FactoryMethod.frame.Product;

/**
 * @ClassName IDCard
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/9 15:55
 * @Version 1.0
 */
public class IDCard extends Product {

    private String owner;

    IDCard(String owner){
        System.out.println("制作"+owner +"的ID卡");
        this.owner= owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+ owner +"的卡");
    }

    public String getOwner(){
        return owner;
    }

}

