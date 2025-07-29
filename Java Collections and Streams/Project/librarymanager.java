package Project;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class librarymanager extends bookmanager {
     static int nextbookId=1000;
    public static void main(String[] args) {
        Map<Book,Boolean> books=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
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
        choice=sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                  addbook(books,sc);
                  break;
            case 2:
                  System.out.println("Delete a book");
                  break;
            case 3:
                  System.out.println("Search a book");
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
            default:System.out.println("Invalid choice");
                break;
        }
        
}while(choice!=0);
sc.close();
}
}
 class bookmanager{
    public static void addbook(Map<Book,Boolean> books,Scanner sc)
    {
        Book b= new Book();
        b.setBookid(librarymanager.nextbookId++);
        System.out.println("Enter boook Title");
        b.setBookname(sc.nextLine());
        System.out.println("Enter Author");
        b.setAuthor(sc.nextLine());
        System.out.println("Enter Publisher");
        b.setPublisher(sc.nextLine());
        System.out.println("Enter Price");
        b.setPrice(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Book Type");
        b.setBooktype(sc.nextLine());
        books.put(b,true);
        System.out.println("Book added Sucessfully");
    }


    public static void displaybytitle(Map<Book,Boolean> books)
    {
        List<Book> sortedbytitlebooks=books.keySet().stream()
                              .sorted(Comparator.comparing((Book b)->b.getBookname()))
                              .collect(Collectors.toList());
         System.out.println("------------------------------------------------");
        for(Book b:sortedbytitlebooks)
        {
            System.out.println("Id: "+b.getBookid());
            System.out.println("Title: "+b.getBookname());
            System.out.println("Author: "+b.getAuthor());
            System.out.println("Publisher: "+b.getPublisher());
            System.out.println("Price: "+b.getPrice());
            System.out.println("Book Type: "+b.getBooktype());
            System.out.println("------------------------------------------------");

        }
                        
    }
 }
