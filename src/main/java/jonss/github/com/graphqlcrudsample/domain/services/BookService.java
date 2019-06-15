package jonss.github.com.graphqlcrudsample.domain.services;

import jonss.github.com.graphqlcrudsample.domain.models.Book;
import jonss.github.com.graphqlcrudsample.domain.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorService authorService;

    public Book create(Book book, String email){
        book.setAuthor(authorService.findAuthorByEmail(email).get());
        return bookRepository.save(book);
    }

    public Optional<Book> findBook(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

}
