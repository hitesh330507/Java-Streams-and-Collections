package Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("unused")
public class librarymanager extends bookmanager {
      static int nextbookId = 1000;

      public static void main(String[] args) {
            Map<Book, Boolean> books = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                  System.out.println(
                              "--------------------------------------------------------------------------------------------------------------");
                  System.out.println("Welcome to the Library Management System");
                  System.out.println("1. Add a book");
                  System.out.println("2. Delete a book");
                  System.out.println("3. Search a book");
                  System.out.println("4. List of books by Title");
                  System.out.println("5. Show available books");
                  System.out.println("6. Show borrowed books");
                  System.out.println("7. Borrow a Book");
                  System.out.println("8. Return a Book");
                  System.out.println("9. Exit");
                  System.out.println("Enter your choice");
                  choice = sc.nextInt();
                  sc.nextLine();
                  switch (choice) {
                        case 1:
                              addbook(books, sc);
                              break;
                        case 2:
                              deletebooks(books, sc);
                              break;
                        case 3:
                              searchbooks(books, sc);
                              break;
                        case 4:
                              printbook(null, books);
                              break;
                        case 5:
                              isavailable(books);
                              break;
                        case 6:
                              isborrow(books);
                              break;
                        case 7:
                              borrow(books,sc);
                              break;
                        case 8:
                              returnbook(books, sc);
                              break;
                        case 9:
                              System.out.println("Thank you Visit Again...........");
                              break;
                        default:
                              System.out.println("Invalid choice");
                              break;
                  }

            } while (choice != 9);
            sc.close();
      }
}
