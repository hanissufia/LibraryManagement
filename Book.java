public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    public Book (String title, String author, String isbn, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable =isAvailable;
    }
    
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setTitle(String title){
         this.title = title;
    }

    public void setAuthor (String author){
        this.author = author;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setIsAvailable (boolean isAvailable){
        this.isAvailable = isAvailable;
    }


    public void printBookInfo(){
        System.out.println("Title: [" + title +"], Author: ["+ author + "], ISBN: [" + isbn + "], Availability: [" 
                            + getIsAvailable() + "]");
    }

}
