package Comlibrarymanagement;

public class Books {
   private String title;
   private  String author;
   private String ISBN;
   private int numberOfCopies;

   public Books(String title,String author, String ISBN, int numberofCopies) {
             this. title = title;
             this.author = author;
             this.ISBN = ISBN;
             this.numberOfCopies = numberofCopies;
   }
   public String getTitle(){
       return title;
   }
public void setTitle(String Title){
       this.title= title;
}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}

