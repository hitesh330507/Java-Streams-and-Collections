package Project;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                  System.out.println("5. List of books by Authors");
                  System.out.println("6. Show available books");
                  System.out.println("7. Show borrowed books");
                  System.out.println("8. Borrow a Book");
                  System.out.println("9. Return a Book");
                  System.out.println("0. Exit");
                  System.out.println("Enter your choice");
                  choice = sc.nextInt();
                  sc.nextLine();
                  switch (choice) {
                        case 1:
                              addbook(books, sc);
                              break;
                        case 2:
                              deletebook(books, sc);
                              break;
                        case 3:
                              searchbook(books, sc);
                              break;
                        case 4:
                              displaybytitle(books);
                              break;
                        case 5:
                              System.out.println("List of books by Authors");
                              break;
                        case 6:
                              System.out.println("Show available books");
                              break;
                        case 7:
                              System.out.println("Show borrowed books");
                              break;
                        case 8:
                              System.out.println("Borrow a Book");
                              break;
                        case 9:
                              System.out.println("Return a Book");
                              break;
                        case 0:
                              System.out.println("Exit");
                              break;
                        default:
                              System.out.println("Invalid choice");
                              break;
                  }

            } while (choice != 0);
            sc.close();
      }
}

