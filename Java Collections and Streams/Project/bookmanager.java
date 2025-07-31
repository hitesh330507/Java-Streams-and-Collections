package Project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
class bookmanager {
    public static void addbook(Map<Book, Boolean> books, Scanner sc) {
        Book b = new Book();
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
        books.put(b, true);
        System.out.println();
        System.out.println("Adding Book Details...........");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Book added Sucessfully");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------");
    }

    public static void displaybytitle(Map<Book, Boolean> books) {
        List<Book> sortedbytitlebooks = books.keySet().stream()
                .sorted(Comparator.comparing((Book b) -> b.getBookname()))
                .collect(Collectors.toList());
        printbook(sortedbytitlebooks, books);
        delay();
    }

    // The Delete Fuction.......!!!!!!!!!!!!!!!!!!

    public static void deletebook(Map<Book, Boolean> books, Scanner sc) {
        System.out.println("Enter the info you know about the book");
        System.out.println("1.Book ID");
        System.out.println("2.Book Name");
        System.out.println("3.Book Author");
        System.out.println("4.Publisher");
        int choice = sc.nextInt();
        switch (choice) {

            // Delete by the Id of the book.....

            case 1:
                System.out.println("Enter Book ID");
                int id = sc.nextInt();
                System.out.println("Deleting Book with ID " + id + "......");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                if (books.keySet().stream().anyMatch(b -> b.getBookid() == id)) {
                    Book todelete = books.keySet().stream().filter(b -> b.getBookid() == id)
                            .findFirst()
                            .get();
                    books.remove(todelete);
                    System.out.println("Book with ID " + id + " Deleted Sucessfully");
                } else
                    System.out.println("Book with ID " + id + " Not Found");
                break;

            // Delete by the name of the book.....

            case 2:
                System.out.println("Enter Book Name ");
                sc.nextLine();
                String name = sc.nextLine().trim().toLowerCase();
                System.out.println("Deleting Book " + name + "......");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                if (books.keySet().stream().anyMatch(b -> b.getBookname()
                        .toLowerCase()
                        .trim()
                        .equals(name))) {
                    Book todelete = books.keySet().stream().filter(b -> b.getBookname()
                            .toLowerCase()
                            .trim()
                            .equals(name))
                            .findFirst().get();
                    books.remove(todelete);
                    System.out.println("Book " + name + " Deleted Sucessfully");
                } else
                    System.out.println("Book " + name + " Not Found");
                break;

            // Delete by the Author of the book

            case 3:
                System.out.println("Enter Book Author ");
                sc.nextLine();
                String author = sc.nextLine().toLowerCase().trim();
                System.out.println("Deleting Book Written by " + author + "......");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                if (books.keySet().stream().anyMatch(b -> b.getAuthor()
                        .toLowerCase()
                        .trim()
                        .equals(author))) {
                    Book todelete = books.keySet().stream().filter(b -> b.getAuthor()
                            .toLowerCase()
                            .trim()
                            .equals(author))
                            .findFirst().get();
                    books.remove(todelete);
                    System.out.println("Book written by " + author + " Deleted Sucessfully");
                } else
                    System.out.println("Book written by " + author + " Not Found");
                break;

            // Delete by the name of the Publisher

            case 4:
                System.out.println("Enter Book Publishers ");
                sc.nextLine();
                String publisher = sc.nextLine().trim().toLowerCase();
                System.out.println("Deleting Book Published by " + publisher + "......");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                if (books.keySet().stream().anyMatch(b -> b.getPublisher()
                        .toLowerCase()
                        .trim()
                        .equals(publisher))) {
                    Book todelete = books.keySet().stream().filter(b -> b.getPublisher()
                            .toLowerCase()
                            .trim()
                            .equals(publisher))
                            .findFirst().get();
                    books.remove(todelete);
                    System.out.println("Book Published by " + publisher + " Deleted Sucessfully");
                } else
                    System.out.println("Book Published by " + publisher + " Not Found");
                break;

            default:
                System.out.println("Enter a valid choice");
                System.out.println("Returning to menu...");
                break;
        }
        delay();
    }

    // Searching a book.....

    public static void searchbook(Map<Book, Boolean> books, Scanner sc) {
        List<Book> result = new ArrayList<>();
        System.out.println("Select the option based on which you wanna search the book???");
        System.out.println("1.Book ID");
        System.out.println("2.Book Name");
        System.out.println("3.Book Author");
        System.out.println("4.Publisher");
        System.out.println("5.Book Type");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter the Book ID");
                int bookid = sc.nextInt();
                System.out.println("Searching Book with ID " + bookid + "......");
                result = books.keySet().stream().filter(b -> b.getBookid() == bookid).collect(Collectors.toList());
                System.out.println();
                if (result.isEmpty())
                    System.out.println("Came later the book you ask is currently Unavailable.....");
                else {
                    System.out.printf("%-8s %-20s %-20s %-20s %-10s %-15s %-10s\n",
                            "Book ID", "Book Name", "Book Author", "Publisher", "Price", "Book Type", "Available");
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------------------");
                    for (Book b : result) {
                        System.out.printf("%-8d %-20s %-20s %-20s %-10d %-15s %-10s\n",
                                b.getBookid(), b.getBookname(), b.getAuthor(), b.getPublisher(),
                                b.getPrice(), b.getBooktype(), books.get(b) ? "Yes" : "No");
                    }
                }
                result.clear();
                break;

            case 2:
                System.out.println("Enter the Book Name");
                String name = sc.nextLine().toLowerCase().trim();
                System.out.println("Searching Book " + name + "......");
                result = books.keySet().stream().filter(b -> b.getBookname()
                        .toLowerCase()
                        .trim()
                        .equals(name)).collect(Collectors.toList());

                System.out.println();
                if (result.isEmpty())
                    System.out.println("Came later the book you ask is currently Unavailable.....");
                else {
                    printbook(result, books);
                }
                result.clear();
                break;

            case 3:
                System.out.println("Enter the Book Author");
                String author = sc.nextLine().toLowerCase().trim();
                System.out.println("Searching Book written by " + author + "......");
                result = books.keySet().stream().filter(b -> b.getAuthor()
                        .toLowerCase()
                        .trim()
                        .equals(author)).collect(Collectors.toList());

                System.out.println();
                if (result.isEmpty())
                    System.out.println("Came later the book you ask is currently Unavailable.....");
                else {
                    printbook(result, books);
                }
                result.clear();
                break;

            case 4:
                System.out.println("Enter the Book Publishers");
                String publisher = sc.nextLine().toLowerCase().trim();
                System.out.println("Searching Book Published by " + publisher + "......");
                result = books.keySet().stream().filter(b -> b.getPublisher()
                        .toLowerCase()
                        .trim()
                        .equals(publisher)).collect(Collectors.toList());

                System.out.println();
                if (result.isEmpty())
                    System.out.println("Came later the book you ask is currently Unavailable.....");
                else {
                    printbook(result, books);
                }
                result.clear();
                break;

            case 5:
                System.out.println("Enter the Book Type");
                String type = sc.nextLine().toLowerCase().trim();
                System.out.println("Searching " + type + " Books......");
                result = books.keySet().stream().filter(b -> b.getBooktype()
                        .toLowerCase()
                        .trim()
                        .equals(type)).collect(Collectors.toList());
                System.out.println();
                if (result.isEmpty())
                    System.out.println("Come back later the book you ask is currently Unavailable.....");
                else {
                    printbook(result, books);
                }

                break;
            default:
                System.out.println();
                System.out.println("Try see The list of books by Selecting the option in the main menu");
                break;
        }
        delay();
    }

    // Method to print the Searched books
    private static void printbook(List<Book> result, Map<Book, Boolean> books) {
        System.out.println();
        System.out.println("Fetching Book Details...........");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-8s %-20s %-20s %-20s %-10s %-15s %-10s\n",
                "Book ID", "Book Name", "Book Author", "Publisher", "Price", "Book Type", "Available");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------");
        if (result.isEmpty())
            System.out.println("                                        Our Stack is Empty For Now!!!!!!!!!!!!!!!");
        else {
            for (Book b : result) {
                System.out.printf("%-8d %-20s %-20s %-20s %-10d %-15s %-10s\n",
                        b.getBookid(),
                        b.getBookname(),
                        b.getAuthor(),
                        b.getPublisher(),
                        b.getPrice(),
                        b.getBooktype(),
                        books.get(b) ? "Yes" : "No");
            }
        }
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------");
    }

    public static void displaybyauthor(Map<Book, Boolean> books) {
        List<Book> sortedbytitlebooks = books.keySet().stream()
                .sorted(Comparator.comparing((Book b) -> b.getAuthor()))
                .collect(Collectors.toList());
        printbook(sortedbytitlebooks, books);
        delay();
    }

    public static void isavailable(Map<Book, Boolean> books) {
        List<Book> result = books.keySet().stream().filter(b -> books.get(b) == true).collect(Collectors.toList());
        printbook(result, books);
        delay();
    }

    public static void isborrowed(Map<Book, Boolean> books) {
        List<Book> result = books.keySet().stream().filter(b -> books.get(b) == false).collect(Collectors.toList());
        printbook(result, books);
        delay();
    }

    public static void borrow(Map<Book, Boolean> books, Scanner sc) {
        System.out.println("Avaliable book.........");
        isavailable(books);
        System.out.println("Enter the book id you wanna borrow");
        int id = sc.nextInt();
        sc.nextLine();
        Book obj = books.keySet().stream().filter(b -> b.getBookid() == id).findFirst().get();
        books.put(obj, false);
        System.out.println("Book borrowed successfully");
        delay();
    }

    public static void returnbook(Map<Book, Boolean> books, Scanner sc) {
        System.out.println("Enter the ID of the book you wanna Return");
        int id = sc.nextInt();
        sc.nextLine();
        Book obj = books.keySet().stream().filter(b -> b.getBookid() == id).findFirst().get();
        if (books.get(obj) == true) {
            System.out.println("Wrong ID Returning to Main Menu");
        } else {
            books.put(obj, true);
            System.out.println("Book Returned Successfully");
        }
        delay();
    }

    public static void delay() {
        System.out.println("Returning to Main Menu.........");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
