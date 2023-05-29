package c01_gettingstart.iterator;

/**
 * 书架
 */
public class BookShelf implements Aggregate<Book>{

    private Book[] books;
    private int last =-1;//最后一本书索引位置,-1表示书架是空的

    public BookShelf(){
        books=new Book[10];
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    /**
     * 查看指定位置书
     * @param i
     * @return
     */
    public Book getBookAt(int i){
        if (i>last || i<0) {
            return null;
        }
        return books[i];
    }

    /**
     * 放一本数到书架上
     * @param book
     * @return
     */
    public Boolean appendBook(Book book){
        if ((last+1)>=books.length){
            return false;
        }
        books[++last]=book;
        return true;
    }

    /**
     * 查看书架上有多少本书
     * @return
     */
    public int getLength(){
        return last+1;
    }

}
