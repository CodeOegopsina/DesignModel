package FactoryMethod;

import FactoryMethod.frame.Factory;
import FactoryMethod.frame.Product;
import FactoryMethod.idcard.IDCardFactory;

/**
 * @ClassName Main
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/9 16:04
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();
        Product caed1 = idCardFactory.create("小明");
        Product caed2 = idCardFactory.create("小x");
        Product caed3 = idCardFactory.create("小vb");
        Product caed4 = idCardFactory.create("小g");
        caed1.use();
        caed2.use();
        caed3.use();
        caed4.use();
    }
}
