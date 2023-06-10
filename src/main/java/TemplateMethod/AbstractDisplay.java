package TemplateMethod;

/**
 * @ClassName AbstractDisplay
 * @Description 类似于tascb中的流程模版方法
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/6 20:07
 * @Version 1.0
 */
public abstract class AbstractDisplay {

    /**
     *交给子类去实现的抽象方法OPEN
     */
    public abstract void open();

    public abstract void print();

    public abstract void close();


    public final void  display(){
        open();
        for(int i = 0 ; i <5;i++){
            print();
        }
        close();
    }
}
