import java.util.*;
class Book{
    int id;
    String name;
    public Book(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Library{
    ArrayList<Book> books = new ArrayList<Book>();

    public void add_book(Book b){
        this.books.add(b);
    }
    public boolean check(int id){
        for(Book bk: this.books){
            if(bk.id == id)
                return true;
        }
        return false;
    }
    public void display_books(){
        System.out.println("The Books are: ");
        for(Book bk: this.books){
            System.out.println("Book: "+bk.name);
        }
    }
}

public class Library_System{
    public static void main(String[] args) {
        Library lb = new Library();
        lb.add_book(new Book(1, "Book 1"));
        lb.add_book(new Book(2, "Book 2"));
        lb.add_book(new Book(3, "Book 3"));
        lb.add_book(new Book(4, "Book 4"));
        lb.add_book(new Book(5, "Book 5"));
        lb.display_books();
        int book_id = 3;
        System.out.println("Searching for book with id: "+book_id);
        if(lb.check(book_id)){
            System.out.println("book is available");
        } else {
            System.out.println("Book is not available");
        }
    }
}