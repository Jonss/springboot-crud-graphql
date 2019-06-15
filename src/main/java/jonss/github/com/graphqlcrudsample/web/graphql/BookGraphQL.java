package jonss.github.com.graphqlcrudsample.web.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import jonss.github.com.graphqlcrudsample.domain.models.Author;
import jonss.github.com.graphqlcrudsample.domain.models.Book;
import jonss.github.com.graphqlcrudsample.domain.services.AuthorService;
import jonss.github.com.graphqlcrudsample.domain.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MutationGraphQL implements GraphQLMutationResolver {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @Autowired
    private BookService bookService;

    public Optional<Book> findBook(String isbn) {
        return bookService.findBook(isbn);
    }

    public Book createBook(Book book) {
        return bookService.create(book);
    }

}


