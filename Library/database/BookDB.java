package Library.database;

import java.util.ArrayList;
import java.util.List;

import Library.model.Book;

public class BookDB{
    private List<Book> books = new ArrayList<>();

    public void save(Book book){
        books.add(book);
    }

    public List<Book> findAll()
    {
        return books;
    }

    public Book findByTitle(String title)
    {
        for(Book book : books)
        {
            if(book.getTitle().equalsIgnoreCase(title))
            {
                return book;
            }
        }
        return null;
    }

    public Book findByIsbn(String isbn)
    {
        for(Book book: books)
        {
            if(book.getIsbn().equals(isbn))
            {
                return book;
            }
        }
        return null;
    }

    public List<Book> findByAuthor(String author)
    {
        List<Book> authorList = new ArrayList<>();
        for(Book book: books)
        {
            if(book.getAuthor().equalsIgnoreCase(author))
            {
                authorList.add(book);
            }
        }
        return authorList;
    }
}
