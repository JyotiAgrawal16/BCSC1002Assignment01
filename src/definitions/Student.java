/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBooksIssuedByTheStudents;
    private Book[] namesOfTheBooksIssuedByTheStudent;

    public Student() {
        this.namesOfTheBooksIssuedByTheStudent = new Book[4];
        for (int i = 0; i < namesOfTheBooksIssuedByTheStudent.length; i++) {
            namesOfTheBooksIssuedByTheStudent[i] = new Book();

        }
    }

    public Student(String nameOfTheStudent, long universityRollNumberOfTheStudent, int numberOfBooksIssuedByTheStudents
            , Book[] namesOfTheBooksIssuedByTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
        this.numberOfBooksIssuedByTheStudents = numberOfBooksIssuedByTheStudents;
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;

    }

    /**
     * This method will allow a student to return a book that they issued.
     *
     * @param name The name of the book that the costumer wants to return.
     */
    public static void doReturn(String name) {
        System.out.println("thanks for returning," + name + ".");
    }

    public String getNameOfTheStudent() {

        return nameOfTheStudent;
    }

    public void setNameOfTheStudent(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }

    public long getUniversityRollNumberOfTheStudent() {
        return universityRollNumberOfTheStudent;
    }

    public void setUniversityRollNumberOfTheStudent(long universityRollNumberOfTheStudent) {

        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
    }

    public int getNumberOfBooksIssuedByTheStudents() {

        return numberOfBooksIssuedByTheStudents;
    }

    public void setNumberOfBooksIssuedByTheStudents(int numberOfBooksIssuedByTheStudents) {
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    public Book[] getNamesOfTheBooksIssuedByTheStudent() {
        return namesOfTheBooksIssuedByTheStudent;
    }

    public void setNamesOfTheBooksIssuedByTheStudent(Book[] namesOfTheBooksIssuedByTheStudent) {

        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfTheStudent='" + nameOfTheStudent + '\'' +
                ", universityRollNumberOfTheStudent=" + universityRollNumberOfTheStudent +
                ", numberOfBooksIssuedByTheStudents=" + numberOfBooksIssuedByTheStudents +
                ", namesOfTheBooksIssuedByTheStudent=" + Arrays.toString(namesOfTheBooksIssuedByTheStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumberOfTheStudent == student.universityRollNumberOfTheStudent &&
                numberOfBooksIssuedByTheStudents == student.numberOfBooksIssuedByTheStudents &&
                Objects.equals(nameOfTheStudent, student.nameOfTheStudent) &&
                Arrays.equals(namesOfTheBooksIssuedByTheStudent, student.namesOfTheBooksIssuedByTheStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameOfTheStudent, universityRollNumberOfTheStudent, numberOfBooksIssuedByTheStudents);
        result = 31 * result + Arrays.hashCode(namesOfTheBooksIssuedByTheStudent);
        return result;
    }

    /**
     * This method will allow us to add a new book.
     *
     * @param name The name of the new book.
     */
    public void addBook(String name) {
        System.out.println("\"" + name + "\" book is issued.");
    }

    /**
     * This method will print all the elements of the `namesOfTheBooksIssuedByTheStudent` array.
     */

//    public void listOfIssuedBooks() {
//        for (Book book : this.namesOfTheBooksIssuedByTheStudent) {
//            System.out.println(book);
}
    }
}
