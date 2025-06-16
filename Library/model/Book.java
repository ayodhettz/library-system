package Library.model;

public class Book{

    private String title;
    private String author;
    private String isbn;
    private boolean bookAvailable = true;

    public Book(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void borrow()
    {
        bookAvailable = false;
    }

    public void bookReturn()
    {
        bookAvailable = true;
    }

    public String toString()
    {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}