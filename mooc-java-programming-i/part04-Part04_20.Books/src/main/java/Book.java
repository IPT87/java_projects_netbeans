
public class Book {
    private String title;
    private int pages;
    private int yearOfPublication;
    
    public Book(String title, int pages, int yearOfPublication) {
        this.title = title;
        this.pages = pages;
        this.yearOfPublication = yearOfPublication;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    
    @Override
    public String toString() {
        return this.getTitle() + ", " + this.getPages() + " pages, " + this.getYearOfPublication();
    }
}
