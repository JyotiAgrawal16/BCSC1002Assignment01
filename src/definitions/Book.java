/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorOfTheBook;
    private String isbnNumberOfTheBook;

    public Book() {
        this.bookName = "jav";
        this.authorOfTheBook = authorOfTheBook;
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }


    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }
    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }
    public String getIsbnNumberOfTheBook() {
        return isbnNumberOfTheBook;
    }

    public void setIsbnNumberOfTheBook(String isbnNumberOfTheBook) {
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorOfTheBook='" + authorOfTheBook + '\'' +
                ", isbnNumberOfTheBook='" + isbnNumberOfTheBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorOfTheBook, book.authorOfTheBook) &&
                Objects.equals(isbnNumberOfTheBook, book.isbnNumberOfTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorOfTheBook, isbnNumberOfTheBook);
    }
}
