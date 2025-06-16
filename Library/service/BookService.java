package Library.service;

import Library.database.BookDB;
import Library.model.Book;
import java.util.List;

public class BookService {
    private BookDB bookDb = new BookDB();

    public void addBook(Book book)
    {
        bookDb.save(book);
    }

    public List<Book> getAllBooks()
    {
        return bookDb.findAll();
    }

    public Book searchByTitle(String title)
    {
        return bookDb.findByTitle(title);
    }

    public Book searchByISBN(String isbn)
    {
        return bookDb.findByIsbn(isbn);
    }

    public List<Book> searchByAuthor(String Author)
    {
        return bookDb.findByAuthor(Author);
    }


}
