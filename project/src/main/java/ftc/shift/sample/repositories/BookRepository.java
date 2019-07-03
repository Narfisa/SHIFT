package ftc.shift.sample.repositories;

import ftc.shift.sample.models.Book;

import java.util.Collection;
import java.util.Map;

/**
 * Интерфейс для получения данных по книгам
 */
public interface BookRepository {

  Book fetchBook(String userId, String bookId);

  Map<String,Book> getOne(String UserId);

  Book updateBook(String userId, String bookId, Book book);

  void deleteBook(String userId, String bookId);

  Book createBook(String userId, Book book);

  Collection<Book> getAllBooks(String userId);
}
