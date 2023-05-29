package c01_gettingstart.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("A1"));
        bookShelf.appendBook(new Book("A2"));
        bookShelf.appendBook(new Book("A3"));
        bookShelf.appendBook(new Book("A4"));
        bookShelf.appendBook(new Book("A5"));
        bookShelf.appendBook(new Book("A6"));
        bookShelf.appendBook(new Book("A7"));
        bookShelf.appendBook(new Book("A8"));
        bookShelf.appendBook(new Book("A9"));
        System.out.println(bookShelf.appendBook(new Book("A10")));
        System.out.println(bookShelf.appendBook(new Book("A11")));


        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hashNext()){
            System.out.println(iterator.next().getName());
        }

    }

}
