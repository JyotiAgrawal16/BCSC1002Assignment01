/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ADD_BOOK = 1;

    private static final int RETURN_VIDEO = 2;
    ;
    private static final int LIST_OF_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Student myStudent = new Student();
        String bookName;
        int videoRating;
        do {

            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may i help u?");
            System.out.println("1. Issue a new book for me. ");
            System.out.println("2. Return a previously issues book for me. ");
            System.out.println("3. Show all my issues books.");

            System.out.println("4. Exit. ");
            System.out.println("Enter your choice (1..4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ADD_BOOK:
                    System.out.println("Enter the name of the Book you want to add: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myStudent.addBook(bookName);
                    break;

                case RETURN_VIDEO:
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myStudent.doReturn(bookName);
                    break;
                case LIST_OF_ISSUED_BOOKS:

                    myStudent.listOfIssuedBooks();
                    break;
                default:
                    break;


            }
        } while (studentInput != EXIT);
    }
}

