import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    static int noOfBooks = 0;

    public void addBook(Book book){
        books.add(book);
        noOfBooks++;
    }

    public Book searchByTitle(String title){
        for(Book book : books){
            if(book.title.equals(title)){
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks(){
        System.out.println("LIBRARY ALL BOOK DETAILS :");
        if(noOfBooks==0){
            System.out.println("No books are available!");
        }
        else{
            for(Book book : books){
                System.out.println("TITLE: "+book.title);
                System.out.println("AUTHOR: "+book.author);
                System.out.println("ISBN: "+book.isbn);
                System.out.println();
            }
        }
    }
}
