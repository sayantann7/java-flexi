import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Library!");
        int exit = 0;

        while(exit==0){
            System.out.println("What do you want to do?");
            System.out.println("Option 1 : Display all books in the library");
            System.out.println("Option 2 : Add a book to the library");
            System.out.println("Option 3 : Search a book by its title from the library");
            System.out.println("Option 4 : Exit the library");
            System.out.print("Enter your option (1/2/3/4) : ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch(choice){
                case 1:
                    library.displayAllBooks();

                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter book TITLE : ");
                    String title = sc.nextLine();
                    System.out.print("Enter book AUTHOR : ");
                    String author = sc.nextLine();
                    System.out.print("Enter book ISBN : ");
                    String isbn = sc.nextLine();
                    
                    Book book = new Book(title, author, isbn);
                    library.addBook(book);
                    System.out.println("The new book has been added!");

                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter book TITLE to search for : ");
                    String searchTitle = sc.nextLine();

                    Book searchedBook = library.searchByTitle(searchTitle);
                    
                    if(searchedBook==null){
                        System.out.println("Could not find the book!");
                    }else{
                        System.out.println("Book has been found :");
                        searchedBook.display();
                    }

                    System.out.println();
                    break;
                case 4:
                    exit = 1;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}
