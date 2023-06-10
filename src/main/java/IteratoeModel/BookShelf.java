package IteratoeModel;

/**
 * @ClassName BookShelf
 * @Description 表示书架的类
 * @Author you_zy@suixingpay.com
 * @Date 2023/5/12 16:06
 * @Version 1.0
 */

public class  BookShelf  implements Aggregate{

    private Book[] books;

    private  int last = 0;

    /**
     * 初始化容量
     * @param maxsize
     */
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    /**
     * 获取书柜中某本书
     * @param index
     * @return
     */
    public Book getBookAt(int index){
        return books[index];
    }
    /**
     * 添加某本书
     * @param book
     */
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
