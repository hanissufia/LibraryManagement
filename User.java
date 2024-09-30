import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Map;
import java.util.HashMap;


public class User {

    private String name;
    private int age;
    private ArrayList<String>borrowedBooks = new ArrayList<>();
    private Map<String, LocalDate> borrowedBooksDueDate;


    public User (String name, int age ) {
         this.name = name;
         this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void borrowBook(String bookTitle){
        borrowedBooks.add(bookTitle);
    }

    public void returnBook(String bookTitle){
       if (borrowedBooks.remove(bookTitle)){
        System.out.println("You have returned " + bookTitle);
       }else {
        System.out.println("You did not return " + bookTitle);
       }
    }

    public void printBorrowedBooks(){
        for(String borrowedBook : borrowedBooks){                
            System.out.println("Your borrowed book list: "+borrowedBook);           
        }
    }

    public void borrowedBooksDueDate(String bookTitle){
        LocalDate currentDate = LocalDate.now();
        LocalDate dueDate = LocalDate.now().plusDays(14);

        borrowedBooksDueDate.put(bookTitle, dueDate);
    }
    
    public void checkDueDates(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");

        for (String book: borrowedBooks){
            LocalDate dueDate = borrowedBooksDueDate.get(book);

            System.out.println("Book: " + book + "\nDue Date: " + dueDate.format(formatter));
        }
    }
    public void checkOverDueBook(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        boolean overdueBooks = false;

        for (String book: borrowedBooks){
            LocalDate dueDate = borrowedBooksDueDate.get(book);

            if(currentDate.isAfter(dueDate)){
                long daysOverdue = Period.between(dueDate, currentDate).getDays();
                System.out.println("Book: " + book + " is overdue by " + daysOverdue + " days");
                overdueBooks = true;
            }
        }

        if (!overdueBooks) {
            System.out.println("No overdue books");
        }
    } 
}