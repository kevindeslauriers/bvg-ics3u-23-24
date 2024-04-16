package frq;

import java.util.ArrayList;

public class BookDriver {
    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();

        Book book1 = new Book("Frakenstein", "Mary Shelley");
        Book book2 = new PictureBook("A Wizard of Oz", "L Frank Baum", "W W Denslow");

        System.out.println(book2);
        
        myLibrary.add(book1);
        myLibrary.add(book2);

        
    }
}
