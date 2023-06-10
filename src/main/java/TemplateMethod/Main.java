package TemplateMethod;

/**
 * @ClassName Main
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/6/6 20:18
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        CharDisplay h = new CharDisplay('h');
        h.display();

        AbstractDisplay helloWorld = new StringDisplay("Hello World");
        helloWorld.display();


        AbstractDisplay helloWorld1 = new StringDisplay("你好啊 世界牛逼");
        helloWorld1.display();

        System.out.println("测试commitAndPush");
    }
}
