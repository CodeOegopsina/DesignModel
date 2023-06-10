package Adapter;

/**
 * @ClassName PrintBanner
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/6 14:35
 * @Version 1.0
 */
public class PrintBanner  extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
