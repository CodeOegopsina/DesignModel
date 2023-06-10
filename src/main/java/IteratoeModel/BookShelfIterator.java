package IteratoeModel;

import java.util.Objects;

/**
 * @ClassName BookShelfIterator
 * @Description TODO
 * @Author you_zy@suixingpay.com
 * @Date 2023/5/12 16:16
 * @Version 1.0
 */
public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book bookAt = bookShelf.getBookAt(index);
        index++;
        return bookAt;
    }
}
