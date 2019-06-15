package jonss.github.com.graphqlcrudsample.web.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jonss.github.com.graphqlcrudsample.domain.models.Author;
import jonss.github.com.graphqlcrudsample.domain.models.Book;
import jonss.github.com.graphqlcrudsample.domain.services.AuthorService;
import jonss.github.com.graphqlcrudsample.domain.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    public Optional<Book> findBook(String isbn) {
        return bookService.findBook(isbn);
    }

    public Optional<Author> findAuthor(String email){
        return authorService.findAuthorByEmail(email);
    }

}
