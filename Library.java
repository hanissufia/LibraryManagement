import java.util.ArrayList;
import java.util.function.Predicate;

public class Library {
    private ArrayList<Book>books = new ArrayList<>();
    private ArrayList<User>users= new ArrayList<>();

    public Library(){
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void searchByTitle(String title){
       for (Book book:books){
        if(book.getTitle().contains(title)){
            System.out.println(title);
        } else {
            System.out.println(title + "is not found");
        } 
      }
    }
    
    public void borrowBook(User user, String title){
        Predicate<Book>availableOrNot = (book) -> book.getTitle().equalsIgnoreCase(title) && book.getIsAvailable();

        for (Book book:books){
            if(availableOrNot.test(book)){
                book.setIsAvailable(false);
                 //the book is not available as it has been borrowed

                 user.borrowBook(book.getTitle());
                    System.out.println("Book has been added to your list");
            } 
           
            System.out.println(title + " is not available");
                
          }
    }


}
