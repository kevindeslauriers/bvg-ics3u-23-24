package conrad;

import java.util.ArrayList;

public class BookDriver {
    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();

        Book book1 = new Book("Frankenstein", "Mark Shelley");
        Book book2 = new PictureBook("The Wizard of Oz", "L Frank Baum", "W W Denslow");

        System.out.println(book1);
        myLibrary.add(book1);
        myLibrary.add(book2);
    }
}
