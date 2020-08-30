/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;
import java.util.Arrays;

public class Library {


    private Book[] booksThatAreCurrentlyAvailable; // field

    // constructor, at least 1


    public Library() {
        this.booksThatAreCurrentlyAvailable = new Book[5];
        for (int i = 0; i < booksThatAreCurrentlyAvailable.length; i++) {
            booksThatAreCurrentlyAvailable[i] = new Book();
        }
    }

    public Library(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }


    // getter
    public Book[] getStore() {
        return booksThatAreCurrentlyAvailable.clone(); // .clone() will return a copy of the array,
        // not the array reference itself.
    }

    // setter
    public void setStore(Book[] store) {
        this.booksThatAreCurrentlyAvailable = store;
    }

    @Override
    public String toString() {
        return "Library{" +
                "store=" + Arrays.toString(booksThatAreCurrentlyAvailable) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(booksThatAreCurrentlyAvailable, library.booksThatAreCurrentlyAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(booksThatAreCurrentlyAvailable);
    }
}
