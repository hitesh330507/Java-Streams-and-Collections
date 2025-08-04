package Project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class bookmanager implements Ibookmanager {
    private static List<Book> result = new ArrayList<>();

    public static void addbook(Map<Book, Boolean> books, Scanner sc) {
        System.out.println("Enter the book name");
        String bookname = sc.nextLine();
        System.out.println("Enter the author name");
        String author = sc.nextLine();
        System.out.println("Enter the publisher name");
        String publisher = sc.nextLine();
        System.out.println("Enter the price");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the book type");
        String booktype = sc.nextLine();
        Book book = new Book();
        book.setBookid(librarymanager.nextbookId++);
        book.setBookname(bookname);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setPrice(price);
        book.setBooktype(booktype);
        books.put(book, true);
        System.out.println("Book added successfully");

    }

    protected static void printbook(List<Book> result, Map<Book, Boolean> books) {
    System.out.println();
    System.out.println("Fetching Book Details...........");

    System.out.println(
            "--------------------------------------------------------------------------------------------------------------");
    System.out.printf("%-8s %-20s %-20s %-20s %-10s %-15s %-10s\n",
            "Book ID", "Book Name", "Book Author", "Publisher", "Price", "Book Type", "Available");
    System.out.println(
            "--------------------------------------------------------------------------------------------------------------");

    Collection<Book> toPrint = result;
    if (toPrint == null) {
        toPrint = books.keySet(); 
    }

    if (toPrint.isEmpty()) {
        System.out.println("                                        Our Stack is Empty For Now!!!!!!!!!!!!!!!");
    } else {
        for (Book b : toPrint) {
            System.out.printf("%-8d %-20s %-20s %-20s %-10d %-15s %-10s\n",
                    b.getBookid(),
                    b.getBookname(),
                    b.getAuthor(),
                    b.getPublisher(),
                    b.getPrice(),
                    b.getBooktype(),
                    books.get(b) != null && books.get(b) ? "Yes" : "No");
        }
    }

    System.out.println(
            "--------------------------------------------------------------------------------------------------------------");
}


    public static void deletebooks(Map<Book, Boolean> books, Scanner sc) {
        System.out.println("Enter the Id of the Book You want to delete");
        int id = sc.nextInt();
        sc.nextLine();
        Book obj = books.keySet().stream().filter(b -> b.getBookid() == id).findFirst().orElse(null);
        if (obj != null) {
            books.remove(obj);
            System.out.println(obj.getBookname() + " Deleted Successfully");
        } else
            System.out.println("Book not found");
    }

    public static void searchbooks(Map<Book, Boolean> books, Scanner sc) {
        System.out.println("Enter the Id of the Book You want to search");
        int id = sc.nextInt();
        sc.nextLine();
        result = books.keySet().stream().filter(b -> b.getBookid() == id).collect(Collectors.toList());
        printbook(result, books);
        result.clear();
    }

    public static void isavailable(Map<Book, Boolean> books) {
    List<Book> result1 = books.keySet()
        .stream()
        .filter(b -> Boolean.TRUE.equals(books.get(b)))
        .collect(Collectors.toList());
    printbook(result1, books);
}

public static void isborrow(Map<Book, Boolean> books) {
    List<Book> result1 = books.keySet()
        .stream()
        .filter(b -> Boolean.FALSE.equals(books.get(b)))
        .collect(Collectors.toList());
    printbook(result1, books);
}


    public static void borrow(Map<Book, Boolean> books, Scanner sc) {
        System.out.println("the List of Books");
        System.out.println();
        printbook(null, books);
        System.out.println("Enter the Id of the Book You want to borrow");
        int id = sc.nextInt();
        sc.nextLine();
        Book obj = books.keySet().stream().filter(b -> b.getBookid() == id).findFirst().orElse(null);
        if (obj != null && books.get(obj) == true) {
            books.put(obj, false);
        } else if (books.get(obj) == false)
            System.out.println("Book is Unavailable ");
        else
            System.out.println("Book not found");
    }

    public static void returnbook(Map<Book, Boolean> books, Scanner sc) {
        
        System.out.println("Enter the Id of the Book You want to Return");
        int id = sc.nextInt();
        sc.nextLine();
        Book obj = books.keySet().stream().filter(b -> b.getBookid() == id).findFirst().orElse(null);
        books.put(obj,true);
        System.out.println("Book Returned Successfully");
    }
}
