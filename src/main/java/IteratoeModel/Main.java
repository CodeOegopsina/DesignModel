package IteratoeModel;

/**
 * @ClassName Main
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/5/12 16:24
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Clinderlla"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book next = (Book)iterator.next();
            System.out.println(next.getName());
        }
    }
}
