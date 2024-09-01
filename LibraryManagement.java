import java.util.ArrayList;
import java.util.Scanner;

class Buyer{
    String title, buyerName;
    int ISBN;

    Buyer(String title, String buyerName, int ISBN){
        this.title = title;
        this.buyerName = buyerName;
        this.ISBN = ISBN;
    }

}
class Book{
    String title, author, availability;
    int ISBN;

    Book(String title, String author, int ISBN, String availability){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
    }
}

class  Library{
    ArrayList<Book> library = new ArrayList<>();
    ArrayList<Buyer> buyerBook = new ArrayList<>();

    void add(Book obj){
        library.add(obj);
    }
    void search(String title){
        for (Book book : library){
            if (book.title.equals(title)){
                System.out.println("Book Found");
                System.out.println("Book Details: ");
                System.out.println("ISBN: "+book.ISBN);
                System.out.println("Book Title: "+book.title);
                System.out.println("Author name: "+book.author);
                System.out.println("Available: "+book.availability);
                return;
            }
        }
        System.out.println("Book not Found");
    }
    void buy(String name, String title){
        for (Book book : library){
            if (book.title.equals(title)){
                book.availability = "false";
                Buyer buyer = new Buyer(title, name, book.ISBN);
                buyerBook.add(buyer);
            }
        }
    }
    void returnBook(String name, String title){
        for (Book book : library){
            if (book.title.equals(title)){
                for (Buyer buyer : buyerBook){
                    if (buyer.buyerName.equals(name) && buyer.ISBN==book.ISBN){
                        buyerBook.remove(buyer);
                        book.availability = "true";
                    }
                }
            }
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        System.out.println("Library System");
        Library library = new Library();
        Scanner useend = new Scanner(System.in);
        String end;
        do {
            System.out.println("Select Option: ");
            System.out.println("a) Add Book");
            System.out.println("b) Search Book");
            System.out.println("c) Get Book");
            System.out.println("d) Return Book");
            System.out.print("a/b/c/d ? ");
            Scanner user = new Scanner(System.in);
            String userchoose = user.next().toLowerCase();

            switch (userchoose){
                case "a":
                    Scanner userDetails = new Scanner(System.in);
                    System.out.print("Author Name: ");
                    String userName = userDetails.nextLine();
                    System.out.print("Book title: ");
                    String userTitle = userDetails.nextLine();
                    System.out.print("Availability Status (true / false): ");
                    String available = userDetails.next();
                    System.out.print("Book ISBN: ");
                    int userISBN = userDetails.nextInt();

                    Book book = new Book(userTitle,userName,userISBN,available);
                    library.add(book);
                    break;
                case "b":
                    Scanner bookt = new Scanner(System.in);
                    System.out.print("Book Title: ");
                    String bookTitle = bookt.nextLine();
                    library.search(bookTitle);
                    break;
                case "c":
                    Scanner bookG = new Scanner(System.in);
                    System.out.print("Enter your Name: ");
                    String bookGetName = bookG.nextLine();
                    System.out.print("Book title: ");
                    String booktitle = bookG.nextLine();
                    library.buy(bookGetName,booktitle);
                    break;
                case "d":
                    Scanner bookR = new Scanner(System.in);
                    System.out.print("Enter your Name: ");
                    String bookRetName = bookR.nextLine();
                    System.out.print("Book title: ");
                    String bookRtitle = bookR.nextLine();
                    library.returnBook(bookRetName,bookRtitle);
                    break;
                default:
                    System.out.println("Invalid Command");
            }
            System.out.print("want to continue (y or n): ");
            end = useend.nextLine();

        }while (end.equals("y"));
    }
}
