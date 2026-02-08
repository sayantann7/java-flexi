public class Book{
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display(){
        System.out.println("TITLE: "+title);
        System.out.println("AUTHOR: "+author);
        System.out.println("ISBN: "+isbn);
    }
}