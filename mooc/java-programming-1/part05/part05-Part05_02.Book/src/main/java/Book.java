
public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }
    
    @Override
    public String toString(){
        String strForm = String.format("%s, %s, %d pages", this.author, this.name, this.pages);
        return strForm;
    }
}
