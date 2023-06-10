package TemplateMethod;

/**
 * @ClassName CharDisplay
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/6 20:12
 * @Version 1.0
 */
public class CharDisplay extends AbstractDisplay{

    private char chl;

    public CharDisplay(char ch){
        this.chl =  ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(chl);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }
}
