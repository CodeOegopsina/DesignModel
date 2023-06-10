package Adapter;

/**
 * @ClassName Banner
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/6 14:19
 * @Version 1.0
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }


}
