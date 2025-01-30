package Chapter9;


public class Book {
    private String isbn, title;
    private int numOfPages;

    public Book(){
    }
    public Book(String isbn, String title, int numOfPages) {
     setIsbn(isbn);
        setTitle(title);
        setNumOfPages(numOfPages);
    }

    public String getIsbn() {return isbn;}

    public void setIsbn(String isbn) {this.isbn = isbn;}

    public String getTitle() {return title;}

    public void setTitle(String title) {
        if (title==null || title=="")
            throw new IllegalArgumentException("You cannot have something to read without a title");
        else
        this.title = title;}

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int pages) {
        if (pages<1)
            throw new IllegalArgumentException("You cannot have something to read without pages");
        numOfPages = pages;}

    public String determineType(int pages){

        String type = "No type";
        if (pages > 0 && pages <=15){
            type = "Article";
        } else if (pages > 15 && pages <= 50) {
            type = "Research Paper";
        } else if (pages > 50) {
            type = "Book";
        }

        return type;
    }

}