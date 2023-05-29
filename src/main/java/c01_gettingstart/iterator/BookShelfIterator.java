package c01_gettingstart.iterator;

/**
 * 书架迭代器
 */
public class BookShelfIterator implements Iterator<Book>{
    private BookShelf bookShelf;
    private int index=-1;//当前指向那本书索引，-1未指向任何书

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hashNext() {
        return (index+1)<bookShelf.getLength();
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(++index);
    }
}
